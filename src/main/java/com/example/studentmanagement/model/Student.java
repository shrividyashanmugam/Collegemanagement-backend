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
@Document(collection="students")
public class Student {
    @Id
    private String id;
    private String name;
    private String course;
    private String rollNo;
    private String duration;
    private String regNo;
}