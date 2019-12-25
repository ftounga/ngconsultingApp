package com.ngconsulting.api.controller;

import com.ngconsulting.api.config.Swagger;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.security.Principal;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private List<DataSource> dataSources;

    @Swagger
    @ApiOperation("test")
    @GetMapping("/test")
    @ResponseBody
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("Test ok");
    }

    @Swagger
    @ApiOperation("me")
    @GetMapping("/me")
    @ResponseBody
    public ResponseEntity<Authentication> me(OAuth2Authentication authentication) {

        return ResponseEntity.status(HttpStatus.OK).body(authentication.getUserAuthentication());
    }
}
