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

    @Column
    private String title;

    @Column
    private String sourceUrl;

    @Column
    private Integer duration;

    @Column
    private String preview;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_formation", nullable = false)
    private FormationEntity formation;
}
