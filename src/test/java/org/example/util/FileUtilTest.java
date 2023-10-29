package org.example.util;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import org.example.domain.acquiring.GenQRCodeReq;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

public class FileUtilTest {

    @Test
    void test(){

        List<Map<String, String>> result = FileUtil.readCsv("/Users/lishanjie/IdeaProjects/testdemo-maven-project/src/main/resources/testcases/acquiring.csv");

        JSONArray jsonArray = JSONArray.from(result);

        System.out.println(jsonArray);

    }


}