package com.ngconsulting.api.repository;

import com.ngconsulting.api.entity.FormationEntity;
import com.ngconsulting.api.entity.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository <LessonEntity, Integer> {

    @Query(value = "SELECT * FROM lesson WHERE id_formation = :idFormation", nativeQuery = true)
    public List<LessonEntity> findLessonsByIdFormation(Integer idFormation);
}
