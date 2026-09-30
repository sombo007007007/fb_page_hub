package com.fb_page_hub.fb_page_hub.auth.register.repository.provider;

import org.apache.ibatis.jdbc.SQL;


public class RegisterProvider {
    
    // list of methods for building SQL queries related to user registration
    public String BuildselectRegisterQuery() {
        return new SQL() {{
            SELECT("*");
            FROM("users");
        }}.toString();
    }   
   
    // BuildInsertRegisterQuery method constructs the SQL query for inserting a new user into the "users" table
    public String BuildInsertRegisterQuery() {
        return new SQL() {{
            INSERT_INTO("users");
            VALUES("username", "#{registerModels.username}");
            VALUES("email", "#{registerModels.email}");
            VALUES("password_hash", "#{registerModels.passwordHash}");
            VALUES("full_name", "#{registerModels.fullName}");
            VALUES("role", "#{registerModels.role}");
            VALUES("created_at", "#{registerModels.createdAt}");
        }}.toString();
    }
    public String BuildEditRegisterQuery() {
        return new SQL() {{
            SELECT("*");
            FROM("users");
            WHERE("id = #{registerModels}");
        }}.toString();
    }
}
