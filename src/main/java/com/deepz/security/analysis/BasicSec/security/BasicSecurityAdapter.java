package com.deepz.security.analysis.BasicSec.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicSecurityAdapter {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .requestMatchers("/data")
                .authenticated()
                .requestMatchers("/sign/**","/logout/**","/contact/**")
                .permitAll().and().httpBasic().and().formLogin();
        return http.build();
    }
}
