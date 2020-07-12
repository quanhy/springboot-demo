package com.demo.annotation;

import com.demo.dto.MessageDTO;

@Sendmq(init = "buildMessage")
public class SoutAndSendMq {

    public  SoutAndSendMq(){
        System.out.println("message cliet");
    }

    public static void main(String[] args) {
        new SoutAndSendMq();
}

    private MessageDTO buildMessage(){
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setCode("1");
        messageDTO.setMessage("test");
        return messageDTO;
    }
}
