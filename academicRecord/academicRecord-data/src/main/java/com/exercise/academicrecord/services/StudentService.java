package com.exercise.academicrecord.services;

import com.exercise.academicrecord.model.Major;
import com.exercise.academicrecord.model.Student;
import com.exercise.academicrecord.model.Subject;

import java.util.Set;

public interface StudentService extends CrudService<Student, Long>{

    Set<Student> findStudentsByMajor(Major major);

    Set<Student> findStudentsBySubject(Subject subject);
}
