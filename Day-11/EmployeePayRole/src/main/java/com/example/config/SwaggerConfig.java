package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI employeePayRoleOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Employee PayRole API")
                        .description("REST API for Employee and Department Management")
                        .version("1.0"));
    }
}