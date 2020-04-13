package com.luv2code.spring.mvc.controller.student;

import com.luv2code.spring.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/student")
public class StudentController {
    @RequestMapping(value="/showForm")
    public String showForm(Model model) {
        // Need to set the model to bind the data form the HTML form
        model.addAttribute("student", new Student());
        return "student/index";
    }

    @RequestMapping(value="/processForm")
    public String processForm(@ModelAttribute("student") Student studentModel) {
       System.out.println("the Student :" + studentModel.getFirstName() + "  " + studentModel.getLastName());
        return "student/student-confirmation";
    }

}
