package com.luv2code.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value="/hello")
    public String getHelloPage() {
        return "hello";
    }
}
