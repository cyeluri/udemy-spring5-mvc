package com.luv2code.spring.mvc.controller.customer;

import com.luv2code.spring.mvc.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
    @RequestMapping(value="/showForm")
    public String showForm(Model model) {
        // Need to set the model to bind the data form the HTML form
        model.addAttribute("customer", new Customer());
        return "customer/index";
    }

    @RequestMapping(value="/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
        System.out.println("the Customer :" + customer.getFirstName() + "  " + customer.getLastName());
        if(bindingResult.hasErrors()) {
            return "customer/index";
        } else {
            return "customer/customer-confirmation";
        }
    }
}
