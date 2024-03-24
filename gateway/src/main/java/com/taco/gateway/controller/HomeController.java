package com.taco.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @ModelAttribute
    public void addIngredientsToModel(Model model) {

    }
    @GetMapping("")
    @ResponseBody
    public String home() {
        return "Home";
    }
}
