package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@ComponentScan({"com.demo"})
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class MessageClientApplication {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(MessageClientApplication.class, args);
//        for(String str : context.getBeanDefinitionNames()){
//            System.out.println(str);
//        }
        String str = "N";
        String pattern = "[YN]{1}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }
}
