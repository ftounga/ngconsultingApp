package com.ngconsulting.api.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ArticleDto extends ItemDto{


    private String preview;
    private LocalDate dateCreation;

    public ArticleDto() {}
}
