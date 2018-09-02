package com.zpy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainHandler {
    @GetMapping("/hi/hello")
    public String Direct(){
        return "hello";
    }
}
