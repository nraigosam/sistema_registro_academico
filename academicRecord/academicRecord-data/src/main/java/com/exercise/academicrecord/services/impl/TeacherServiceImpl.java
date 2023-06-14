package com.exercise.academicrecord.services.impl;

import com.exercise.academicrecord.model.Teacher;
import com.exercise.academicrecord.repositories.TeacherRepository;
import com.exercise.academicrecord.services.TeacherService;

import java.util.HashSet;
import java.util.Set;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Set<Teacher> findAll() {
        return new HashSet<>(teacherRepository.findAll());
    }

    @Override
    public Teacher findById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher save(Teacher object) {
        return null;
    }

    @Override
    public void delete(Teacher object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Teacher findBySubject(Long subjectId) {
        return null;
    }
}
