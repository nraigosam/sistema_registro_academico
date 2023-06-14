package com.exercise.academicrecord.services.impl;

import com.exercise.academicrecord.model.Major;
import com.exercise.academicrecord.model.Student;
import com.exercise.academicrecord.model.Subject;
import com.exercise.academicrecord.repositories.StudentRepository;
import com.exercise.academicrecord.services.StudentService;

import java.util.HashSet;
import java.util.Set;

public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Set<Student> findAll() {
        return new HashSet<>(studentRepository.findAll());
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Set<Student> findStudentsByMajor(Major major) {
        return new HashSet<>(studentRepository.findStudentsByMajor(major));
    }

    @Override
    public Set<Student> findStudentsBySubject(Subject subject) {
        return new HashSet<>(studentRepository.findStudentsBySubject(subject));
    }
}
