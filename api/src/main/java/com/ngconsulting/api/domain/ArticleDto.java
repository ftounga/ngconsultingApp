package com.ngconsulting.api.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ArticleDto {

    private Integer id;
    private String title;
    private String urlImg;
    private String location;
    private String preview;
    private LocalDate dateCreation;
}
