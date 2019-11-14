package com.ngconsulting.api.domain;

import lombok.Data;

@Data
public class FormationDto extends ItemDto {

    private Integer lessonCount;
    private Integer totalMinutes;
    public FormationDto(){}

}
