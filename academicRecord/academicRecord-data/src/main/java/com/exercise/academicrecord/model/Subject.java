package com.exercise.academicrecord.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subjects")
public class Subject extends BaseEntity {

    public Subject(Long id, String name, float grade, Teacher teacher, Set<StudentSubject> studentSubjects) {
        super(id);
        this.name = name;
        this.grade = grade;
        this.teacher = teacher;
        this.studentSubjects = studentSubjects;
    }

    private String name;
    private float grade;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @OneToMany(mappedBy = "subject")
    private Set<StudentSubject> studentSubjects = new HashSet<>();
}
