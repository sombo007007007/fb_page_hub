package com.fb_page_hub.fb_page_hub.auth.register.model;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data 
public class RegisterModels {
    private Long id;
    @NotBlank (message = "Username is required")
    private String username;
    @NotBlank (message = "Email is required")
    private String email;
    @NotBlank (message = "Password is required")
    private String passwordHash;
    @NotBlank (message = "Full Name is required")
    private String fullName;
    @NotBlank (message = "Role is required")
    private String role;
    private Boolean status;
    private LocalDateTime createdAt;
}
