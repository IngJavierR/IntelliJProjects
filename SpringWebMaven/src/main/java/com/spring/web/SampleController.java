package com.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jrodriguez on 16/01/16.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "HelloWorld!";
    }

    @RequestMapping("/test")
    @ResponseBody
    String test(){
        return "HelloWorldTest!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class, args);
    }
}
