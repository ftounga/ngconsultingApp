package com.ngconsulting.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "formation")
@Data
public class FormationEntity extends ItemEntity {

    private Integer lessonCount;

    private Integer totalMinutes;

    @OneToMany(mappedBy = "formation", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<LessonEntity> lessons;

}
