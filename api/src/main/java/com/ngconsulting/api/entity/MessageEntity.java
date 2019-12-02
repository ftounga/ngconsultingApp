package com.ngconsulting.api.entity;

import com.ngconsulting.api.converter.MessageObjectConverter;
import com.ngconsulting.api.domain.MessageObject;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "message")
@Data
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String phoneNumber;
    @Convert(converter = MessageObjectConverter.class)
    private MessageObject object;
    private String message;
}
