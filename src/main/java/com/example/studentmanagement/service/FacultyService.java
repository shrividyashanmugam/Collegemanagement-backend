package com.example.studentmanagement.service;

import com.example.studentmanagement.model.Faculty;
import com.example.studentmanagement.repository.FacultyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository repo;

    public Faculty createFaculty(Faculty faculty) {
        return repo.save(faculty);
    }

    public List<Faculty> getAllFaculties() {
        return repo.findAll();
    }

    public Optional<Faculty> getFacultyById(String id) {
        return repo.findById(id);
    }
}