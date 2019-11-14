package com.ngconsulting.api.domain;

import lombok.Data;

@Data
public abstract class ItemDto {

    private Integer id;
    private String title;
    private String urlImg;
    private String location;

    public ItemDto(){}

}
