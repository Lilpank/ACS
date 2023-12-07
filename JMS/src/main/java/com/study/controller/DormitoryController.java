package com.study.controller;

import com.study.models.Dormitories;
import com.study.repos.DormitoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DormitoryController {
    @Autowired
    DormitoryRepository dormRepository;

    @GetMapping("/dorm")
    public Iterable<Dormitories> getStudents() {
        var a = dormRepository.findAll();
        return a;
    }
    @GetMapping("/dorm/{id}")
    public @ResponseBody Optional<Dormitories> getStudent() {
        var a = dormRepository.findById(1324);
        return a;
    }
}
