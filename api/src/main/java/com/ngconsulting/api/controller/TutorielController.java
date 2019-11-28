package com.ngconsulting.api.controller;

import com.ngconsulting.api.config.Swagger;
import com.ngconsulting.api.domain.TutorielDto;
import com.ngconsulting.api.service.TutorielService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tutoriels")
public class TutorielController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TutorielService tutorielService;

    @Swagger
    @ApiOperation("Get all tutoriels")
    @GetMapping
    public ResponseEntity<List<TutorielDto>> getAllTutoriels() {

        logger.info("******* get all tutoriels");
        return ResponseEntity.ok(tutorielService.getAllTutoriels());
    }
}
