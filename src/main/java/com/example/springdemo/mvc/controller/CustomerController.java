package com.example.springdemo.mvc.controller;

import com.example.springdemo.mvc.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    // model allows us to share the information between controllers and view pages
    @GetMapping("/")
    public String showForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "customer-form"; // will return customer-form.html page
    }
}
