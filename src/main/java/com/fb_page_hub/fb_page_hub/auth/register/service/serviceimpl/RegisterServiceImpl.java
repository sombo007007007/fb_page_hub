package com.fb_page_hub.fb_page_hub.auth.register.service.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fb_page_hub.fb_page_hub.auth.register.model.RegisterModels;
import com.fb_page_hub.fb_page_hub.auth.register.repository.RegisterRepository;
import com.fb_page_hub.fb_page_hub.auth.register.service.RegisterService;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class RegisterServiceImpl implements RegisterService {
    private final RegisterRepository registerRepository;
    // Implement the methods defined in RegisterService here
    @Override
    public List<String> getAllRegisteredUsers() {
        // Implementation code here
        return registerRepository.getAllRegisteredUsers().stream()
                .map(RegisterModels::getUsername)
                .toList();
    }

    @Override
    public void AddUser(String username, 
                        String email, 
                        String passwordHash, 
                        String fullName, 
                        String role) {
        // Implementation code here
        RegisterModels registerModels = new RegisterModels();
    }

    @Override
    public RegisterModels RegisterById(Long id) {
        // Implementation code here
        return null;
    }

    @Override
    public void UpdateUser(String username, 
                           String email, 
                           String passwordHash, String fullName, String role) {
        // Implementation code here
    }

    @Override
    public void DeletedUser(Long id) {
        // Implementation code here
    }

}
