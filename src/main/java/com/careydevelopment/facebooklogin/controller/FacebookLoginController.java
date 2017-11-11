package com.careydevelopment.facebooklogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FacebookLoginController {
	
    //starting page for Facebook login demo
    @RequestMapping("/facebookLogin")
    public String facebookLogin(Model model) {
        return "facebookLogin";
    }
    
    
    //redirect to demo if user hits the root
    @RequestMapping("/")
    public String home(Model model) {
        return "redirect:facebookLogin";
    }
}
