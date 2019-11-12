package com.ngconsulting.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private List<DataSource> dataSources;

    @GetMapping("/login")
    @ResponseBody
    public ResponseEntity<String> test() {
        return ResponseEntity.status(HttpStatus.OK).body("Test ok");
    }
}
