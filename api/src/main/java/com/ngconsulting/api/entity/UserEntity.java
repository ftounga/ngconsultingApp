package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;

    private String name;
    private String email;
    private Integer age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<CompetenceEntity> competences;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ExperienceEntity> experiences;
}
