package com.udacity.jwdnd.course2.dogrestapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;

public class SpringSecurityConfig{
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests().anyRequest().authenticated()
//                .and().httpBasic();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password(encoder().encode("password"))
//                .roles("USER");
//    }

//    @Bean
//    public SecurityFilterChain appSecurity(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder){
//        User admin = (User) User.withUsername("admin")
//                .password(encoder.encode("password"))
//                .roles("USER").build();
//        return new InMemoryUserDetailsManager(admin);
//    }
//
//    @Bean
//    public PasswordEncoder encoder(){
//        return new BCryptPasswordEncoder();
//    }
}
