package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.entity.FormationEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

public class FormationMapperTest {

    @Test
    public void should_map_formationEntityToDto(){

        FormationEntity formationEntity = new FormationEntity();
        formationEntity.setLessonCount(3);
        formationEntity.setTotalMinutes(23);
        formationEntity.setLocation("location formation");
        formationEntity.setUrlImg("url img");
        formationEntity.setId(2);
        formationEntity.setLessons(Collections.emptyList());

        FormationDto formationDto = FormationMapper.formationEntityToDto(formationEntity);

        Assertions.assertThat(formationDto).isEqualToIgnoringGivenFields(formationEntity, "chapters", "lessons");
    }

    @Test
    public void should_map_formationDtoToEntity(){

        FormationDto dto = new FormationDto();
        dto.setLessonCount(3);
        dto.setTotalMinutes(23);
        dto.setLocation("location formation");
        dto.setUrlImg("url img");
        dto.setId(2);
        dto.setChapters(Collections.emptyList());

        FormationEntity formationEntity = FormationMapper.formationDtoToEntity(dto);

        Assertions.assertThat(formationEntity).isEqualToIgnoringGivenFields(dto, "chapters", "lessons");
    }
}
