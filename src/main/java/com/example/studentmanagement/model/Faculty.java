package com.example.studentmanagement.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "faculty")

public class Faculty {

    @Id
    private String id;

    private String name;
    private String department;
    private String designation;
    private String experience;
    private String facultyId;

}