package com.exercise.academicrecord.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registers")
public class Register extends BaseEntity{

    public Register(Long id, Student student, Major major, LocalDate date, StudentStatus status) {
        super(id);
        this.student = student;
        this.major = major;
        this.date = date;
        this.status = status;
    }

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    private Major major;

    private LocalDate date;

    @Enumerated(value = EnumType.STRING)
    private StudentStatus status;

}
