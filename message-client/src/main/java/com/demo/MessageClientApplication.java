package com.demo;

import com.demo.annotation.SoutAndSendMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class MessageClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageClientApplication.class, args);
    }
}
