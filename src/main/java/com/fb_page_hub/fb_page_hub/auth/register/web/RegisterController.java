package com.fb_page_hub.fb_page_hub.auth.register.web;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

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
          registerService.getAllRegisteredUsers()
        );// Replace null with the actual list of registered users
    }
    //PostMapping("/v1/register")
  @Operation (summary = "Register a new user", description = "This endpoint allows you to register a new user.")
  @PostMapping ("/v1/register")
    public ResponseEntity<Map<String, String>> registerUser(
                                           @RequestParam("username") String username, 
                                           @RequestParam("email") String email, 
                                           @RequestParam("passwordHash") String passwordHash, 
                                           @RequestParam("fullName") String fullName, 
                                           @RequestParam("role") String role) {
        // Implementation code here
        registerService.AddUser(username, email, passwordHash, fullName, role);
        return ResponseEntity.ok(
          Map.of("message", "User registered successfully"
          ));
    }
    @Operation (summary = "Get user by ID", description = "This endpoint allows you to get a user by their ID.")
    @GetMapping("/v1/register/{id}")
    public ResponseEntity<RegisterModels> getUserById(@PathVariable("id") Long id) {
        // Implementation code here
        RegisterModels user = registerService.RegisterById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }  
      }   
}
