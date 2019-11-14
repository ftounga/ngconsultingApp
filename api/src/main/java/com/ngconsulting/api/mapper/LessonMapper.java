package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.LessonDto;
import com.ngconsulting.api.entity.LessonEntity;

public class LessonMapper {

    public static LessonDto lessonEntityToLessonDto(LessonEntity entity){

        LessonDto dto = new LessonDto();
        dto.setId(entity.getId());
        dto.setDuration(entity.getDuration());
        dto.setIdFormation(entity.getFormation().getId());
        dto.setPreview(entity.getPreview());
        dto.setSourceUrl(entity.getSourceUrl());
        dto.setTitle(entity.getTitle());
        return dto;
    }

    public static LessonEntity lessonDtoToLessonEntityWithoutFormation(LessonDto dto){
        LessonEntity entity = new LessonEntity();
        entity.setId(dto.getId());
        entity.setDuration(dto.getDuration());
        entity.setPreview(dto.getPreview());
        entity.setSourceUrl(dto.getSourceUrl());
        entity.setTitle(dto.getTitle());
        return entity;
    }
}
