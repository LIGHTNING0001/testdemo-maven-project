package org.example.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;


@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println(" 测试 ： myRunner");

    }


}
