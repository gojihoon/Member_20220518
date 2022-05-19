package com.its.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("save-form")
    public String saveForm() {
        return "save";
    }

    @GetMapping("login-form")
    public String loginForm(){
        return "login";
    }
}
