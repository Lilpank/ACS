package com.study.controller;

import com.study.models.Room;
import com.study.repos.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/room")
    public Iterable<Room> getStudents() {
        var a = roomRepository.findAll();
        return a;
    }

    @GetMapping("/room/{id}")
    public @ResponseBody Optional<Room> getStudent() {
        var a = roomRepository.findById(1324);
        return a;
    }
}
