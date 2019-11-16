package com.ngconsulting.api.controller;

import com.ngconsulting.api.config.Swagger;
import com.ngconsulting.api.domain.ArticleDto;
import com.ngconsulting.api.service.ArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Swagger
    @ApiOperation("Get all articles ")
    @GetMapping
    public ResponseEntity<List<ArticleDto>> getAll() {
       return ResponseEntity.ok(articleService.getAllArticles());
    }
}
