package com.ngconsulting.api.repository;

import com.ngconsulting.api.entity.FormationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepository extends JpaRepository<FormationEntity, Integer> {
}
