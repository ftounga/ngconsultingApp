package com.ngconsulting.api.controller;

import com.ngconsulting.api.config.Swagger;
import com.ngconsulting.api.domain.UserDto;
import com.ngconsulting.api.service.ContactService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private ContactService contactService;

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
    public ResponseEntity<UserDto> me(OAuth2Authentication oAuth2Authentication) {

        LinkedHashMap details = (LinkedHashMap) oAuth2Authentication.getUserAuthentication().getDetails();
        UserDto UserDto = contactService.findUserByEmail((String) details.get("email"));
        return ResponseEntity.status(HttpStatus.OK).body(UserDto);
    }
}
