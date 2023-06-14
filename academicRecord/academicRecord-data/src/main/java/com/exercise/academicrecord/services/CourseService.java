package com.exercise.academicrecord.services;

import com.exercise.academicrecord.model.Major;

import java.util.Set;

public interface CourseService extends CrudService<Major, Long>{

    Set<StudentService> getStudentsList();
}
