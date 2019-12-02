package com.ngconsulting.api.service;

import com.ngconsulting.api.domain.MessageDto;

import java.util.List;

public interface ContactService {

    public MessageDto sendMessage(MessageDto messageDto);

    public List<MessageDto> getAllMessages();
}
