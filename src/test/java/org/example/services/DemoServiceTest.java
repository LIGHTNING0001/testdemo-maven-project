package org.example.services;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;



public class DemoServiceTest {



    @Mock
    public List<String> stringList;

    @BeforeClass
    public void init() {
//        mock 注解需要搭配 MockitoAnnotations.openMocks(testClass) 方法一起使用
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void test(){

        stringList.add("one");
//
        Mockito.verify(stringList).add("two");

//        Mockito.when(stringList.size()).thenReturn(100);
//
//        Assert.assertEquals(stringList.size(), 10);

    }

}