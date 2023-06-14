package com.exercise.academicrecord.repositories;

import com.exercise.academicrecord.model.Subject;
import com.exercise.academicrecord.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Teacher findTeacherBySubject(Subject subject);
}
