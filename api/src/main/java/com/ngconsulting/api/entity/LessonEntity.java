package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "lesson")
@Data
public class LessonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lesson")
    private Integer id;

    private String title;
    private String sourceUrl;
    private Integer duration;
    private String preview;
    private Integer idFormation;
}
