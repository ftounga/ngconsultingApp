package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.MessageDto;
import com.ngconsulting.api.domain.MessageObject;
import com.ngconsulting.api.entity.MessageEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageMapperTest {

    @Test
    public void shouldMapMessageEntityToDto(){

        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setPhoneNumber("phone number");
        messageEntity.setObject(MessageObject.FEEDBACK);
        messageEntity.setName("Name message");
        messageEntity.setEmail("email message");
        messageEntity.setId(3);
        messageEntity.setMessage("message");

        MessageDto messageDto = MessageMapper.fromMessageEntityToDto(messageEntity);

        Assertions.assertThat(messageDto).isEqualToIgnoringGivenFields(messageEntity, "object");
        Assertions.assertThat(messageDto.getObject()).isEqualTo(messageEntity.getObject().getValue());

    }

    @Test
    public void shouldMapMessageDtoToEntity(){

        MessageDto messageDto = new MessageDto();
        messageDto.setPhoneNumber("phone number");
        messageDto.setObject("FEEDBACK");
        messageDto.setName("Name message");
        messageDto.setEmail("email message");
        messageDto.setId(3);
        messageDto.setMessage("message");

        MessageEntity messageEntity = MessageMapper.fromMessageDtoToEntity(messageDto);

        Assertions.assertThat(messageEntity).isEqualToIgnoringGivenFields(messageDto, "id", "dateCreation", "object");
        Assertions.assertThat(messageDto.getObject()).isEqualTo(messageEntity.getObject().getValue());
    }
}
