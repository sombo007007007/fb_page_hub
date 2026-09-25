package com.fb_page_hub.fb_page_hub.auth.register.service;

import java.util.List;


import com.fb_page_hub.fb_page_hub.auth.register.model.RegisterModels;

public interface RegisterService {
    // List RegisterService methods here
    List<String> getAllRegisteredUsers();
    
    // Add a new user to the database
    void AddUser(String username, 
                 String email, 
                 String passwordHash, 
                 String fullName, 
                 String role);

    // Edit an existing user's information
    RegisterModels RegisterById(Long id);
    
    // update an existing user's information
    void UpdateUser(String username, 
                    String email, 
                    String passwordHash, 
                    String fullName,            
                    String role); 
    // Delete    Users Register
    void DeletedUser(Long id); 
}