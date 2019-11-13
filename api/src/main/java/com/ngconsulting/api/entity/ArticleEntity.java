package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "article")
public class ArticleEntity extends ItemEntity {

    @Column
    private String preview;
    @Column
    private LocalDate dateCreation;
}
