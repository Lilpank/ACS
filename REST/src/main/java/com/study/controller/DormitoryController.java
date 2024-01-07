package com.study.controller;

import com.study.models.Dormitories;
import com.study.repos.DormitoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(
        value = "api",
        produces = {"application/xml", "application/json"}
)

public class DormitoryController {
    @Autowired
    DormitoryRepository dormRepository;

    @GetMapping("/dorm")
    public Iterable<Dormitories> getDormitory() {
        return dormRepository.findAll();
    }
    @GetMapping("/dorm/{id}")
    public @ResponseBody Optional<Dormitories> getDormitory(@PathVariable int id_card) {
        return dormRepository.findById(id_card);
    }
    @PostMapping("/student")
    public @ResponseBody Dormitories createDormitory(@RequestBody Dormitories dormitory) {
        return dormRepository.save(dormitory);
    }

    @DeleteMapping("/student/{id_card}")
    public @ResponseBody void deleteDormitory(@PathVariable int id_card) {
        dormRepository.deleteById(id_card);
    }
}
