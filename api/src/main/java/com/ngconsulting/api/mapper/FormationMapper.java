package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.entity.FormationEntity;

public class FormationMapper {

    public static FormationDto formationEntityToFormationDto(FormationEntity entity){

        FormationDto dto = new FormationDto();
        dto.setId(entity.getId());
        dto.setLessonCount(entity.getLessonCount());
        dto.setLessonCount(entity.getTotalMinutes());
        dto.setLocation(entity.getLocation());
        dto.setTitle(entity.getTitle());
        dto.setUrlImg(entity.getUrlImg());
        return dto;
    }

    public static FormationEntity formationEntityToFormationDto(FormationDto dto){

        FormationEntity entity = new FormationEntity();
        entity.setId(dto.getId());
        entity.setLessonCount(dto.getLessonCount());
        entity.setLessonCount(dto.getTotalMinutes());
        entity.setLocation(dto.getLocation());
        entity.setTitle(dto.getTitle());
        entity.setUrlImg(dto.getUrlImg());
        return entity;
    }
}