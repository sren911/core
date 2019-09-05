package com.sren.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        //SpringApplication.run(CoreApplication.class, args);
        new SpringApplicationBuilder(CoreApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}
