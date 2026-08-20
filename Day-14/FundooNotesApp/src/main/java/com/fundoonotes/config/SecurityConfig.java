package com.fundoonotes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.fundoonotes.security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {
	
	private final JwtAuthenticationFilter jwtAuthenticationFilter;

	public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter) {
	    this.jwtAuthenticationFilter = jwtAuthenticationFilter;
	}	

// IN-MEMORY AUTHENTICATION - USED BEFORE JWT
//
// @Bean
// public UserDetailsService userDetailsService() {
//
//	     UserDetails user = User
//	             .withUsername("Vaidik")
//	             .password("{Vaidik}123")
//	             .roles("USER")
//	             .build();
//
//	     return new InMemoryUserDetailsManager(user);
// }
		
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf(csrf -> csrf.disable())
		    .sessionManagement(session ->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		    .authorizeHttpRequests(auth -> auth
		    		.requestMatchers("/auth/register",
		    						 "/auth/login",
		    						 "/auth/forgot-password",
		    						 "/auth/reset-password"
		    		).permitAll()
					.anyRequest()
					.authenticated()
		    	)

            .addFilterBefore(jwtAuthenticationFilter,UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}
}