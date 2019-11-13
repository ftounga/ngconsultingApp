package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "competence")
@Data
public class CompetenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competence")
    private Integer id;

    private String skill;
    private Integer value;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity user;
}
