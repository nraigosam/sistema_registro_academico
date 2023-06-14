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
@Table(name = "students")
public class Student extends Person{

    public Student(Long id, String name, String lastName, String email, Set<Role> roles, Register register,
                   Major major, Set<StudentSubject> studentSubjects) {
        super(id, name, lastName, email, roles);
        this.register = register;
        this.major = major;
        this.studentSubjects = studentSubjects;
    }

    @OneToOne
    @JoinColumn(name = "register_id")
    private Register register;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Major major;

    @OneToMany(mappedBy = "student")
    private Set<StudentSubject> studentSubjects = new HashSet<>();

}
