package com.sren.core.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:53
 * @Description:
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
        context.close();
    }
}
