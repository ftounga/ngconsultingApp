package com.ngconsulting.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
public class SecurityResourceServerConfig extends ResourceServerConfigurerAdapter {

    private static final String SERVER_RESOURCE_ID = "oauth2-server";

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .anyRequest().hasRole("USER");
//                .access("#oauth2.hasRole('USER')");      // require 'read' scope to access /demo URL
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(SERVER_RESOURCE_ID);
    }
}
