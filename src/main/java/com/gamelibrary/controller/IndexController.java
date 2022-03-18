package com.gamelibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({ "/", "/index" })
    public String index(Model model) {
        model.addAttribute("name", "XBOX"); // set 'John' value for 'name' attribute

        return "index"; // name of the View
    }
}
