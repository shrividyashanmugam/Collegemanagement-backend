package com.example.studentmanagement.controller;


import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import com.example.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins="*")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.createStudent(student);
    }
    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable String id) {
        return service.getStudentById(id);
    }
}
