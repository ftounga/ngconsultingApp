package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.TutorielDto;
import com.ngconsulting.api.domain.TutorielType;
import com.ngconsulting.api.entity.TutorielEntity;

public class TutorielMapper {


    public static TutorielDto tutorielEntityToTutorielDto(TutorielEntity entity) {
        TutorielDto dto = new TutorielDto();
        dto.setType(entity.getType().getValue());
        dto.setId(entity.getId());
        dto.setLocation(entity.getLocation());
        dto.setTitle(entity.getTitle());
        dto.setUrlImg(entity.getUrlImg());
        dto.setAvailable(entity.getAvailable());
        return dto;
    }

    public static TutorielEntity tutorielDtoToTutorielDto(TutorielDto dto){
        TutorielEntity entity = new TutorielEntity();
        entity.setType(TutorielType.fromType(dto.getType()));
        entity.setId(dto.getId());
        entity.setLocation(dto.getLocation());
        entity.setTitle(dto.getTitle());
        entity.setUrlImg(dto.getUrlImg());
        entity.setAvailable(dto.getAvailable());
        return entity;
    }
}
