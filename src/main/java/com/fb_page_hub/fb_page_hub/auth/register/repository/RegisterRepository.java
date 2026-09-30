package com.fb_page_hub.fb_page_hub.auth.register.repository;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.fb_page_hub.fb_page_hub.auth.register.model.RegisterModels;
import com.fb_page_hub.fb_page_hub.auth.register.repository.provider.RegisterProvider;

@Repository 
@Mapper 
public interface RegisterRepository {
    //List of methods for interacting with the database related to user registration
    @SelectProvider (type = RegisterProvider.class, method = "BuildselectRegisterQuery")
    List<RegisterModels> getAllRegisteredUsers();
    
    // InsertProvider annotation specifies the provider class and method to build the SQL query for inserting a new user
    @InsertProvider (type = RegisterProvider.class, method = "BuildInsertRegisterQuery")
    void Create(@Param("registerModels") RegisterModels registerModels);
    // edit user information
    @SelectProvider (type = RegisterProvider.class, method = "BuildEditRegisterQuery")
    RegisterModels getRegisterById(@Param("registerModels") Long id);
}
