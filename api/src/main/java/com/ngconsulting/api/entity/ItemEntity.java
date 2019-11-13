package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String title;

    @Column
    private String urlImg;

    @Column
    private String location;
}
