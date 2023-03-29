package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        //表示这个对象返回的方法将会装配到容器中
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    }
}
