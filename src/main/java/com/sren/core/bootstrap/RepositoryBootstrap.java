package com.sren.core.bootstrap;

import com.sren.core.annotation.EnableHelloWorld;
import com.sren.core.configuration.HelloWorldConfiguration;
import com.sren.core.repository.MyRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午2:27
 * @Description:
 */
@EnableHelloWorld
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = applicationContext.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
        applicationContext.close();
    }

}
