package com.example.jackpotdelivery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String Hello(){
        return "Hello World";
    }
}
