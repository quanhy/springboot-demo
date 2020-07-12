package com.demo.controller;

import com.demo.annotation.Sendmq;
import com.demo.dto.MessageDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Sendmq(init = "buildMessage")
public class DemoController {

    @GetMapping("/test")
    public void test(){
        System.out.println("test method");
    }

    private MessageDTO buildMessage(){
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setCode("1");
        messageDTO.setMessage("test");
        return messageDTO;
    }

}
