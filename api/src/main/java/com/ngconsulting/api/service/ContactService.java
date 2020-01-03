package com.ngconsulting.api.service;

import com.ngconsulting.api.domain.MessageDto;
import com.ngconsulting.api.domain.UserDto;

import java.util.List;

public interface ContactService {

    public MessageDto sendMessage(MessageDto messageDto);

    public List<MessageDto> getAllMessages();

    public UserDto findUserByEmail(String email);
}
