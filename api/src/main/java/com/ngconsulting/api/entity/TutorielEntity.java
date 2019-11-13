package com.ngconsulting.api.entity;

import com.ngconsulting.api.converter.TutorielTypeConverter;
import com.ngconsulting.api.domain.TutorielType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tutoriel")
@Data
public class TutorielEntity extends ItemEntity {

    @Convert(converter = TutorielTypeConverter.class)
    private TutorielType type;
}
