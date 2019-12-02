package com.ngconsulting.api.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MessageDto {

    private Integer id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String object;
    @NotNull
    private String message;
}
