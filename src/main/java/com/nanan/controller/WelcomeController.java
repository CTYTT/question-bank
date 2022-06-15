package com.nanan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tant
 * @Date: 2022/6/15 16:40
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/hello")
    private String hello(){
        return "hello spring boot";
    }
}
