package com.ngconsulting.api.repository;

import com.ngconsulting.api.entity.TutorielEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorielRepository extends JpaRepository<TutorielEntity, Integer> {
}
