package com.ngconsulting.api.service.impl;

import com.ngconsulting.api.domain.MessageDto;
import com.ngconsulting.api.entity.MessageEntity;
import com.ngconsulting.api.mapper.MessageMapper;
import com.ngconsulting.api.repository.MessageRepository;
import com.ngconsulting.api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public MessageDto sendMessage(MessageDto messageDto) {
       MessageEntity entity = messageRepository.save(MessageMapper.fromMessageDtoToEntity(messageDto));
       return MessageMapper.fromMessageEntityToDto(entity);
    }

    @Override
    public List<MessageDto> getAllMessages() {
        return messageRepository.findAll().stream().map(MessageMapper::fromMessageEntityToDto).collect(Collectors.toList());
    }
}
