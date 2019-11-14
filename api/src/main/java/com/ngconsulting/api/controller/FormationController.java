package com.ngconsulting.api.controller;

import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.domain.LessonDto;
import com.ngconsulting.api.domain.TutorielDto;
import com.ngconsulting.api.service.FormationService;
import com.ngconsulting.api.service.TutorielService;
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

    @Autowired
    private FormationService formationService;

    @GetMapping
    public ResponseEntity<List<FormationDto>> getAllFormations() {
        return ResponseEntity.ok(formationService.getAllFormations());
    }

    @GetMapping("{idFormation}/lessons")
    public ResponseEntity<List<LessonDto>> getLessonsByFormation(@PathVariable(name = "idFormation") @NonNull Integer idFormation){
        return ResponseEntity.ok(formationService.getLessonsByIdFormation(idFormation));
    }
}
