package com.demo.annotation.controller;

import java.io.IOException;
import java.io.InputStream;

public class Practise {

    public void inputStreamUse() {
        InputStream is = this.getClass().getResourceAsStream("/a.txt");
        byte[] buffer = new byte[1024];
        int n=0;
        StringBuffer sb = new StringBuffer();
        try {
            while ((n = is.read(buffer)) != -1) {
                sb.append(new String(buffer, 0, n));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(sb.toString());

    }


    public static void main(String[] args) {
//        new Practise().inputStreamUse();
//        String str = new String("abca");
//        str.toLowerCase();
//        String a = "a";
//        String.valueOf(str.charAt(0)).equals(a);
        String str = "hello  world";
        int len = str.length();
        StringBuilder newStr = new StringBuilder("");
        for(int i=0;i<len;i++){
            if(String.valueOf(str.charAt(i)).equals(" ")){
                newStr.append("%20");
            }else{
                newStr.append(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(newStr.toString());
    }


}
