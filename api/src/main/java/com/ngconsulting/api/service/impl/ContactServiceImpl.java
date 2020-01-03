package com.ngconsulting.api.service.impl;

import com.ngconsulting.api.domain.MessageDto;
import com.ngconsulting.api.domain.UserDto;
import com.ngconsulting.api.entity.MessageEntity;
import com.ngconsulting.api.entity.UserEntity;
import com.ngconsulting.api.mapper.MessageMapper;
import com.ngconsulting.api.mapper.UserMapper;
import com.ngconsulting.api.repository.MessageRepository;
import com.ngconsulting.api.repository.UserRepository;
import com.ngconsulting.api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SimpleMailMessage templateMailMessage;

    @Autowired
    private Environment env;

    @Override
    public MessageDto sendMessage(MessageDto messageDto) {
        MessageEntity entity = messageRepository.save(MessageMapper.fromMessageDtoToEntity(messageDto));
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(env.getProperty("mail.receiver"));
        message.setSubject(messageDto.getObject());
        message.setText(String.format(templateMailMessage.getText(), messageDto.getName(), messageDto.getPhoneNumber(), messageDto.getMessage()));
        mailSender.send(message);
        return MessageMapper.fromMessageEntityToDto(entity);
    }

    @Override
    public List<MessageDto> getAllMessages() {
        return messageRepository.findAll().stream().map(MessageMapper::fromMessageEntityToDto).collect(Collectors.toList());
    }

    @Override
    public UserDto findUserByEmail(String email){
        UserEntity userEntity = userRepository.findByEmail(email);
        return UserMapper.entityToUserDto(userEntity);
    }
}
