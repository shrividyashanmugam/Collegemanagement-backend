package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student createStudent(Student student) {
        return repo.save(student);
    }
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
    public Optional<Student> getStudentById(String id) {
        return repo.findById(id);
    }
}
