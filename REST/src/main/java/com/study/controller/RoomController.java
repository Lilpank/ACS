package com.study.controller;

import com.study.models.Room;
import com.study.repos.RoomRepository;
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
public class RoomController {
    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/room")
    public Iterable<Room> getRoom() {
        return roomRepository.findAll();
    }

    @GetMapping("/room/{id}")
    public @ResponseBody Optional<Room> getRoom(@PathVariable int id_card) {
        return roomRepository.findById(id_card);
    }

    @PostMapping("/room")
    public @ResponseBody Room createRoom(@RequestBody Room room) {
        return roomRepository.save(room);
    }

    @DeleteMapping("/room/{id_card}")
    public @ResponseBody void deleteRoom(@PathVariable int id_card) {
        roomRepository.deleteById(id_card);
    }
}
