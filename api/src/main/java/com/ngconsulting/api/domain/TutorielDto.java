package com.ngconsulting.api.domain;

import lombok.Data;

@Data
public class TutorielDto extends ItemDto {

    private String type;
    private Boolean disponible;

    public TutorielDto(){}
}
