package com.ngconsulting.api.converter;

import com.ngconsulting.api.domain.TutorielType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import static java.util.Objects.nonNull;

@Converter
public class TutorielTypeConverter implements AttributeConverter<TutorielType, String> {
    @Override
    public String convertToDatabaseColumn(TutorielType tutorielType) {
        return nonNull(tutorielType) ? tutorielType.getType() : null;
    }

    @Override
    public TutorielType convertToEntityAttribute(String type) {
        return nonNull(type) ? TutorielType.fromType(type) : null;
    }
}
