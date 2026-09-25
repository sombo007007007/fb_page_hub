package com.fb_page_hub.fb_page_hub.auth.register.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class RegisterController {
    
  @GetMapping("/v1/register")
    public String register() {
        return "register";
    }
}
