package com.ngconsulting.api.controller;

import com.ngconsulting.api.config.Swagger;
import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.domain.LessonDto;
import com.ngconsulting.api.domain.TutorielDto;
import com.ngconsulting.api.service.FormationService;
import com.ngconsulting.api.service.TutorielService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FormationService formationService;

    @Swagger
    @ApiOperation("Get all formations")
    @GetMapping
    public ResponseEntity<List<FormationDto>> getAllFormations() {
        logger.info("******** get all formations");
        return ResponseEntity.ok(formationService.getAllFormations());
    }

    @Swagger
    @ApiOperation("Get all video of a formation")
    @GetMapping("{idFormation}/lessons")
    public ResponseEntity<List<LessonDto>> getLessonsByFormation(@PathVariable(name = "idFormation") @NonNull Integer idFormation){
        logger.info("*********** get all lessons by formation: "+ idFormation);
        return ResponseEntity.ok(formationService.getLessonsByIdFormation(idFormation));
    }
}
