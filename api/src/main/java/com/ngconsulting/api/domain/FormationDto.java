package com.ngconsulting.api.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FormationDto extends ItemDto {

    private Integer lessonCount;
    private Integer totalMinutes;
    private List<LessonDto> chapters = new ArrayList<>();
    public FormationDto(){}

}
