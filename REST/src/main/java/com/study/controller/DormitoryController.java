package com.study.controller;

import com.study.models.Dormitories;
import com.study.repos.DormitoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody Optional<Dormitories> getDormitory(@PathVariable int id) {
        return dormRepository.findById(id);
    }

    @PostMapping("/dorm")
    public @ResponseBody Dormitories createDormitory(@RequestBody Dormitories dormitory) {
        var dorm = dormRepository.save(dormitory);
        return dorm;
    }

    @DeleteMapping("/dorm/{id}")
    public @ResponseBody void deleteDormitory(@PathVariable int id) {
        var dorm = dormRepository.findById(id);
        if (dorm.isPresent()){
            dormRepository.deleteById(id);
        }
    }


    @PutMapping("/dorm/{id}")
    public @ResponseBody Dormitories updateDormitory(@RequestBody Dormitories newDorm, @PathVariable Integer id) {
        return dormRepository.findById(id)
                .map(dormitories -> {
                    dormitories.setId_dorm(newDorm.getId_dorm());
                    dormitories.setUniversity(newDorm.getUniversity());
                    return dormRepository.save(dormitories);
                })
                .orElseGet(() -> {
                    return dormRepository.save(newDorm);
                });
    }
}
