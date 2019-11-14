package com.ngconsulting.api.service.impl;

import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.mapper.FormationMapper;
import com.ngconsulting.api.repository.FormationRepository;
import com.ngconsulting.api.service.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FormationServiceImpl implements FormationService {

    @Autowired
    private FormationRepository formationRepository;

    @Override
    public List<FormationDto> getAllFormations() {
        return formationRepository.findAll().stream().map(FormationMapper::formationEntityToFormationDto).collect(Collectors.toList());
    }
}
