package com.ngconsulting.api.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {

    private Integer id;

    private String name;
    private String email;
    private Integer age;
    private String picture;

    private LocalDate dateCreation;

    private LocalDate dateConnexion;
}
