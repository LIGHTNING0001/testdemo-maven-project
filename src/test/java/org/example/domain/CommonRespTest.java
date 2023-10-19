package org.example.domain;

import com.alibaba.fastjson2.JSONObject;
import org.testng.annotations.Test;

public class CommonRespTest {


    @Test
    public void test(){

        CommonResp commonResp = CommonResp.builder()
                .format("json")
                .merchantNo("xxx")
                .method("xx")
                .signContent("xx")
                .verison("xx")
                .signType("xx")
                .sign("xx")
                .build();

        System.out.println(JSONObject.from(commonResp).toString());
    }


}