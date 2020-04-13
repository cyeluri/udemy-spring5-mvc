package com.luv2code.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String processForm2(HttpServletRequest request, Model model) {
        // Read request param
        String name = request.getParameter("studentName");
        //convert name to UPPER CASE
        name = name.toUpperCase();
        //Create message
        String result = "V2 Yo !!" + name;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String processForm3(@RequestParam("studentName") String name, Model model) {
        //convert name to UPPER CASE
        name = name.toUpperCase();
        //Create message
        String result = "V3 Yo !!" + name;
        model.addAttribute("message", result);
        return "helloworld";
    }

}
