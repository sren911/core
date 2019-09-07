package com.sren.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: renshuai
 * @date: 2019/09/06 下午4:25
 * @Description:
 */
@RestController
public class HelloWorldController {

    @GetMapping("")
    public String hello() {
        int i = 1/0;
        return "index";
    }
}
