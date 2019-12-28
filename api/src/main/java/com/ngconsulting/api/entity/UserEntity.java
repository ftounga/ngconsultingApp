package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="iduser_id_seq")
    @SequenceGenerator(name = "user_type_generator", sequenceName = "iduser_id_seq")
    @Column(name = "id_user")
    private Integer id;

    private String name;
    private String email;
    private Integer age;
    private String picture;

    @Column
    private LocalDate dateCreation;

    @Column
    private LocalDate dateConnexion;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<CompetenceEntity> competences;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<ExperienceEntity> experiences;
}
