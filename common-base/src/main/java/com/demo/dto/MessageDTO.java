package com.demo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MessageDTO implements Serializable {
    private String code;
    private String message;

    @Override
    public String toString() {
        return "MessageDTO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
