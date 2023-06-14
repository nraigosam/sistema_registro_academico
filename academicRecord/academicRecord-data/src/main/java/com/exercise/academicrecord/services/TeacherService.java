package com.exercise.academicrecord.services;

import com.exercise.academicrecord.model.Teacher;

public interface TeacherService extends CrudService<Teacher, Long>{

    Teacher findBySubject(Long subjectId);
}
