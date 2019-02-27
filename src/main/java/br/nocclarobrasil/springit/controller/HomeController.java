package br.nocclarobrasil.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String handle(Model model, HttpServletRequest request) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }
    
}
