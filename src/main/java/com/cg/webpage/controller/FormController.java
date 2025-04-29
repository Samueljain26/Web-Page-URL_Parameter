package com.cg.webpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FormController {

    @GetMapping("/")
    public String showPage1() {
        return "page1";
    }

    @GetMapping("/page2")
    public String showPage2(@RequestParam String firstName,
                            @RequestParam String lastName,
                            Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return "page2";
    }

    @GetMapping("/page3")
    public String showPage3(@RequestParam String firstName,
                            @RequestParam String lastName,
                            @RequestParam String email,
                            @RequestParam String phoneNumber,
                            Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phoneNumber);
        return "page3";
    }

    @GetMapping("/page4")
    public String showPage4(@RequestParam String firstName,
                            @RequestParam String lastName,
                            @RequestParam String email,
                            @RequestParam String phoneNumber,
                            @RequestParam String city,
                            @RequestParam String country,
                            Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phoneNumber", phoneNumber);
        model.addAttribute("city", city);
        model.addAttribute("country", country);
        return "page4";
    }
}
