package com.fb_page_hub.fb_page_hub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FbPageHubApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FbPageHubApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // startup code
    }
}