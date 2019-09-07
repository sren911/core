package com.sren.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author: renshuai
 * @date: 2019/09/07 上午10:55
 * @Description:
 */
@ControllerAdvice(assignableTypes=HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> error(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }
}
