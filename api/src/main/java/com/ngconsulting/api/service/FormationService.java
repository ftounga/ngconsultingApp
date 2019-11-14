package com.ngconsulting.api.service;

import com.ngconsulting.api.domain.FormationDto;
import com.ngconsulting.api.domain.LessonDto;

import java.util.List;

public interface FormationService {

    public List<FormationDto> getAllFormations();

    public List<LessonDto> getLessonsByIdFormation(Integer idFormation);

}
