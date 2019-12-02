package com.ngconsulting.api.controller;

import com.ngconsulting.api.config.Swagger;
import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.domain.MessageDto;
import com.ngconsulting.api.service.ContactService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ContactService contactService;

    @Swagger
    @ApiOperation("Send message")
    @PostMapping
    public ResponseEntity<MessageDto> sendMessage(@RequestBody @NonNull @Valid MessageDto messageDto) {
        logger.info("******** send message");
        return ResponseEntity.ok(contactService.sendMessage(messageDto));
    }

    @Swagger
    @ApiOperation("Get all messages")
    @GetMapping("all")
    public ResponseEntity<List<MessageDto>> getAllMessages() {
        logger.info("******** get all messages");
        return ResponseEntity.ok(contactService.getAllMessages());
    }
}
