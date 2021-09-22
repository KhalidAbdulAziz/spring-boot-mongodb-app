package com.springmongo.springmongo.controller;


import com.springmongo.springmongo.model.Student;
import com.springmongo.springmongo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    public StudentRepo studentRepo;

    @GetMapping("api/students/all")
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @PostMapping("api/students")
    public String createStudent(@RequestBody Student student) {
        Student insertedStudent = studentRepo.insert(student);
        return "student created" + insertedStudent.getName();
    }


}
