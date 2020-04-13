package com.luv2code.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @RequestMapping(value="/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping(value="/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormV2")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // Read request param
        String name = request.getParameter("studentName");
        //convert name to UPPER CASE
        name = name.toUpperCase();
        //Create message
        String result = "Yo !!" + name;
        model.addAttribute("message", result);
        return "helloworld";
    }
}
