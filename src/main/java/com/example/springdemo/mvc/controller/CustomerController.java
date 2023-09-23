package com.example.springdemo.mvc.controller;

import com.example.springdemo.mvc.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    // model allows us to share the information between controllers and view pages
    @GetMapping("/")
    public String showForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "customer-form"; // will return customer-form.html page
    }

    @PostMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer,
                              BindingResult theBindingResult
    ){
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }

        return "customer-confirmation";
    }
}
