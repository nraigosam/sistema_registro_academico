package com.exercise.academicrecord.repositories;

import com.exercise.academicrecord.model.Major;
import com.exercise.academicrecord.model.Student;
import com.exercise.academicrecord.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentsByMajor(Major major);

    List<Student> findStudentsBySubject(Subject subject);
}
