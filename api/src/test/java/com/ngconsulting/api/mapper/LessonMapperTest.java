package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.domain.LessonDto;
import com.ngconsulting.api.entity.FormationEntity;
import com.ngconsulting.api.entity.LessonEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LessonMapperTest {

    @Test
    public void should_map_lessonEntityToDto(){

        FormationEntity formationEntity = new FormationEntity();
        formationEntity.setLessonCount(3);
        formationEntity.setTotalMinutes(23);
        formationEntity.setLocation("location formation");
        formationEntity.setUrlImg("url img");

        LessonEntity lessonEntity = new LessonEntity();
        lessonEntity.setDuration(34);
        lessonEntity.setId(2);
        lessonEntity.setPreview("Preview Lesson");
        lessonEntity.setSourceUrl("source url lesson");
        lessonEntity.setTitle("title lesson");
        lessonEntity.setFormation(formationEntity);

        LessonDto lessonDto = LessonMapper.lessonEntityToLessonDto(lessonEntity);
        Assertions.assertThat(lessonDto).isEqualToIgnoringGivenFields(lessonEntity, "idFormation", "formation");
    }

    @Test
    public void should_map_lessonDtoToEntity(){

        LessonDto dto = new LessonDto();
        dto.setDuration(34);
        dto.setId(2);
        dto.setPreview("Preview Lesson");
        dto.setSourceUrl("source url lesson");
        dto.setTitle("title lesson");
        dto.setIdFormation(3);

        LessonEntity lessonEntity = LessonMapper.lessonDtoToLessonEntityWithoutFormation(dto);
        Assertions.assertThat(lessonEntity).isEqualToIgnoringGivenFields(dto, "idFormation", "formation");
    }
}
