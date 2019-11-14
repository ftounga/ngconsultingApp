package com.ngconsulting.api.domain;

import com.ngconsulting.api.entity.FormationEntity;
import lombok.Data;

import javax.persistence.*;

@Data
public class LessonDto {

    private Integer id;
    private String title;
    private String sourceUrl;
    private Integer duration;
    private String preview;
    private Integer idFormation;
}
