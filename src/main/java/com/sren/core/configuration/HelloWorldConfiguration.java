package com.sren.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午3:52
 * @Description:
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        return "hello";
    }
}
