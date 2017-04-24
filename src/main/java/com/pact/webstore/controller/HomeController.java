package com.pact.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by F91 on 25.03.2017.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String welcome(Model model){
    model.addAttribute("greeting","Witaj w sklepie internetowym!");
    model.addAttribute("tagline", "Wyjątkowym i jedynym sklepie internetowym");
    return "welcome";
    }
}
