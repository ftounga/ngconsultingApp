package com.ngconsulting.api.converter;

import com.ngconsulting.api.domain.MessageObject;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import static java.util.Objects.nonNull;

@Converter
public class MessageObjectConverter implements AttributeConverter<MessageObject, String> {
    @Override
    public String convertToDatabaseColumn(MessageObject messageObject) {
        return nonNull(messageObject) ? messageObject.getValue() : null;
    }

    @Override
    public MessageObject convertToEntityAttribute(String object) {
        return nonNull(object) ? MessageObject.fromValue(object) : null;
    }
}
