package com.fb_page_hub.fb_page_hub.auth.register.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fb_page_hub.fb_page_hub.auth.register.model.RegisterModels;
import com.fb_page_hub.fb_page_hub.auth.register.service.RegisterService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController 
@RequiredArgsConstructor 
public class RegisterController {
  private final RegisterService registerService;
    
  @Operation (summary = "Register a new user", description = "This endpoint allows you to register a new user.")
  @GetMapping("/v1/register")
    public ResponseEntity<List<RegisterModels>> getAllRegisteredUsers() {
        // Implementation code here
        return ResponseEntity.ok(
          registerService.getAllRegisteredUsers().stream()
                .map(username -> {
                    RegisterModels user = new RegisterModels();
                    user.setUsername(username);
                    return user;
                }).toList()
        );// Replace null with the actual list of registered users
    }
    //PostMapping("/v1/register")
  @Operation (summary = "Register a new user", description = "This endpoint allows you to register a new user.")
  @PostMapping ("/v1/register")
    public String registerUser() {
        return "registerUser";
    }
}
