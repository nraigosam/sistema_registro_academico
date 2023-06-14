package com.exercise.academicrecord.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Major extends BaseEntity {

    public Major(Long id, String name, String description, Set<Student> students) {
        super(id);
        this.name = name;
        this.description = description;
        this.students = students;
    }

    private String name;
    private String description;

    @OneToMany
    @JoinColumn(name = "student_id")
    private Set<Student> students;

}
