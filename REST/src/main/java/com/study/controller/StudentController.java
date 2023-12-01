package com.study.controller;

import com.study.models.Student;
import com.study.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(
        value = "api",
        produces = {"application/xml", "application/json"}
)
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public @ResponseBody Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id_card}")
    public @ResponseBody Optional<Student> getStudent(@PathVariable int id_card) {
        return studentRepository.findById(id_card);
    }

    @PostMapping("/student")
    public @ResponseBody Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @DeleteMapping("/student/{id_card}")
    public @ResponseBody void deleteStudent(@PathVariable int id_card) {
        studentRepository.deleteById(id_card);
    }
}

