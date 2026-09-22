package com.fb_page_hub.fb_page_hub.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "FB Page Hub API",
                version = "1.0.0",
                description = "FB Page Hub REST API Documentation",
                contact = @Contact(
                        name = "Sombo",
                        email = "sombo@example.com"
                )
        )
)
public class SwaggerConfig {

}
