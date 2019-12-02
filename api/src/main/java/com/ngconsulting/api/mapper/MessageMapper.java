package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.MessageDto;
import com.ngconsulting.api.domain.MessageObject;
import com.ngconsulting.api.entity.MessageEntity;

import java.time.LocalDate;

public class MessageMapper {

    public static MessageEntity fromMessageDtoToEntity(MessageDto dto){

        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setEmail(dto.getEmail());
        messageEntity.setName(dto.getName());
        messageEntity.setMessage(dto.getMessage());
        messageEntity.setObject(MessageObject.fromValue(dto.getObject()));
        messageEntity.setPhoneNumber(dto.getPhoneNumber());
        messageEntity.setDateCreation(LocalDate.now());
        return  messageEntity;
    }

    public static MessageDto fromMessageEntityToDto(MessageEntity entity){

        MessageDto messageDto = new MessageDto();
        messageDto.setId(entity.getId());
        messageDto.setEmail(entity.getEmail());
        messageDto.setName(entity.getName());
        messageDto.setMessage(entity.getMessage());
        messageDto.setObject(entity.getObject().getValue());
        messageDto.setPhoneNumber(entity.getPhoneNumber());
        messageDto.setDateCreation(entity.getDateCreation());
        return  messageDto;
    }
}
