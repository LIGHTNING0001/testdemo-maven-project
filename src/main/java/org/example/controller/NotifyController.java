package org.example.controller;


import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.CommonParam;
import org.example.domain.table.Merchant;
import org.example.repository.MerchantRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/test")
public class NotifyController {


    private final MerchantRepository merchantRepository;

    NotifyController(MerchantRepository merchantRepository){
        this.merchantRepository = merchantRepository;
    }


    @GetMapping("get")
    public String get(){

        log.info("接收到请求");

        return "ok";

    }


    @PostMapping("/notify")
    public void notify(@RequestBody CommonParam commonResp, HttpServletRequest request){

        String ipAddr = request.getRemoteAddr();

        log.info("请求的IP: " + ipAddr);
        JSONObject msg = JSONObject.from(commonResp);
        // todo 解码
        log.info("收到的消息：==》" + msg.toString());
        // todo 通知消息持久化

    }

    @RequestMapping("/create")
    public void create(){

        Merchant merchant = new Merchant();

        merchant.setMerchantNo("1");
        merchant.setPrivateRsaKey_Merchant("2");
        merchant.setPublicRsaKey_platform("3");

        merchantRepository.save(merchant);

    }

    @RequestMapping("/query")
    public List<Merchant> query(){

        List<Merchant> merchantList = merchantRepository.findAll();

        return merchantList;

    }


}
