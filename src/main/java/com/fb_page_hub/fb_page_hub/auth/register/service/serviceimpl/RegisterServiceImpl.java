package com.fb_page_hub.fb_page_hub.auth.register.service.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fb_page_hub.fb_page_hub.auth.register.model.RegisterModels;
import com.fb_page_hub.fb_page_hub.auth.register.repository.RegisterRepository;
import com.fb_page_hub.fb_page_hub.auth.register.service.RegisterService;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class RegisterServiceImpl implements RegisterService {
    private final RegisterRepository registerRepository;
    private final PasswordEncoder passwordEncoder;
    // Implement the methods defined in RegisterService here
    @Override
    public List<RegisterModels> getAllRegisteredUsers() {
        // Implementation code here
        return registerRepository.getAllRegisteredUsers();
    }

    @Override
    public void AddUser(String username, 
                        String email, 
                        String passwordHash, 
                        String fullName, 
                        String role) {
        try {

            // Add the logic to create a new RegisterModels object and save it to the repository
            RegisterModels registerModels = new RegisterModels();
            registerModels.setUsername(username);
            registerModels.setEmail(email);
            registerModels.setPasswordHash(passwordEncoder.encode(passwordHash)); // Hash the password before saving
            registerModels.setFullName(fullName);
            registerModels.setRole(role);
            registerModels.setCreatedAt(LocalDateTime.now()); // Set the created_at timestamp
            registerRepository.Create(registerModels);

        } catch (Exception e) {
            throw new RuntimeException("Error creating RegisterModels object", e);
        }

    }

    @Override
    public RegisterModels RegisterById(Long id) {
        // Implementation code here
        return registerRepository.getRegisterById(id);
    }

    @Override
    public void UpdateUser(String username, 
                           String email, 
                           String passwordHash, 
                           String fullName, 
                           String role) {
        // Implementation code here
    }

    @Override
    public void DeletedUser(Long id) {
        // Implementation code here
    }

}
