package org.example.controller;


import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.CommonResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/test")
public class NotifyController {


    @PostMapping("/notify")
    public void notify(@RequestBody CommonResp commonResp, HttpServletRequest request){

        String ipAddr = request.getRemoteAddr();

        log.info("请求的IP: " + ipAddr);
        JSONObject msg = JSONObject.from(commonResp);
        //todo 解码
        log.info("收到的消息：==》" + msg.toString());

    }


}
