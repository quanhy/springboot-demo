package com.demo.okhttpClient;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@Slf4j
public class OkhttpClientTest {
    private volatile static int count = 0;

    public static void main(String[] args) {
        String url = "http://localhost:8888/hello";
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).get().build();
        Call call = null;

        for(int i=0;i<210;i++){
            call = okHttpClient.newCall(request);
            call.enqueue(new Callback() {
                public void onFailure(@NotNull Call call, @NotNull IOException e) {
                    log.info("出现异常：{}",e.getMessage());
                }

                public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                    count++;
//                    log.info("成功：{}",response.body().string());
                }
            });
        }
        log.info("成功个数：{}",count);
    }

}
