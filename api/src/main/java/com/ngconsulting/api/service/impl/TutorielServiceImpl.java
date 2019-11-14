package com.ngconsulting.api.service.impl;

import com.ngconsulting.api.domain.TutorielDto;
import com.ngconsulting.api.mapper.TutorielMapper;
import com.ngconsulting.api.repository.TutorielRepository;
import com.ngconsulting.api.service.TutorielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TutorielServiceImpl implements TutorielService {

    @Autowired
    private TutorielRepository tutorielRepository;

    @Override
    public List<TutorielDto> getAllTutoriels() {
        return tutorielRepository.findAll().stream().map(TutorielMapper::tutorielEntityToTutorielDto).collect(Collectors.toList());
    }
}
