package com.example.studentmanagement.controller;

import com.example.studentmanagement.model.Faculty;
import com.example.studentmanagement.service.FacultyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/faculty")
@CrossOrigin(origins="*")

public class FacultyController {

    @Autowired
    private FacultyService service;

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return service.createFaculty(faculty);
    }

    @GetMapping
    public List<Faculty> getFaculties() {
        return service.getAllFaculties();
    }

    @GetMapping("/{id}")
    public Optional<Faculty> getFacultyById(@PathVariable String id) {
        return service.getFacultyById(id);
    }
}