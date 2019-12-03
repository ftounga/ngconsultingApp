package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.TutorielDto;
import com.ngconsulting.api.domain.TutorielType;
import com.ngconsulting.api.entity.TutorielEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TutorielMapperTest {

    @Test
    public void should_map_tutoriel_dto_to_entity(){

        TutorielEntity entity = new TutorielEntity();
        entity.setAvailable(false);
        entity.setType(TutorielType.GUIDE);
        entity.setId(2);
        entity.setLocation("location");
        entity.setTitle("title");
        entity.setUrlImg("urlImg");

        TutorielDto tutorielDto = TutorielMapper.tutorielEntityToTutorielDto(entity);
        Assertions.assertThat(entity.getType().getValue()).isEqualTo(tutorielDto.getType());
        Assertions.assertThat(entity.getAvailable()).isFalse();
    }

    @Test
    public void should_map_tutoriel_entity_to_dto(){

        TutorielDto tutorielDto = new TutorielDto();
        tutorielDto.setAvailable(false);
        tutorielDto.setType(TutorielType.GUIDE.getValue());
        tutorielDto.setId(2);
        tutorielDto.setLocation("location");
        tutorielDto.setTitle("title");
        tutorielDto.setUrlImg("urlImg");

        TutorielEntity entity = TutorielMapper.tutorielDtoToEntity(tutorielDto);
        Assertions.assertThat(entity.getType().getValue()).isEqualTo(tutorielDto.getType());
        Assertions.assertThat(entity.getAvailable()).isFalse();
    }
}
