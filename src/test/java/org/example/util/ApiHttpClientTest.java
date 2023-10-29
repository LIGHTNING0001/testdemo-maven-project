package org.example.util;

import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.domain.CommonParam;
import org.testng.annotations.Test;

import java.net.http.HttpResponse;

import static org.testng.Assert.*;

public class ApiHttpClientTest {



    @Test
    void testDoGet(){
        ApiHttpClient apiHttpClient = new ApiHttpClient();

        HttpResponse<String> response = apiHttpClient.doGet("http://localhost:8080/test/get");

        System.out.println(response.body());
    }

    @Test
    void testDoPost(){

        ApiHttpClient apiHttpClient = new ApiHttpClient();

        CommonParam commonParam = CommonParam.builder()
                .format("a")
                .merchantNo("a")
                .method("a")
                .sign("a")
                .signContent("a")
                .signType("a")
                .verison("a.a")
                .build();

        JSONObject jsonObject = JSONObject.from(commonParam);

        System.out.println(jsonObject.toString());

        HttpResponse<String> response =
                apiHttpClient.doPost("http://localhost:8080/test/notify", jsonObject.toString());

        System.out.println(response);

    }
}