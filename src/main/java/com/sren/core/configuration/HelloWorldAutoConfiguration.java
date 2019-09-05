package com.sren.core.configuration;

import com.sren.core.annotation.EnableHelloWorld;
import com.sren.core.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:55
 * @Description:
 */
@Configuration
@EnableHelloWorld
@ConditionalOnSystemProperty(name = "user.name", value = "Mercy")
public class HelloWorldAutoConfiguration {


}
