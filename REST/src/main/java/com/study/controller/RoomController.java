package com.study.controller;

import com.study.models.Room;
import com.study.repos.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/room")
    public @ResponseBody Room createRoom(@RequestBody Room room) {
        var room_ = roomRepository.save(room);
        return room;
    }

    @DeleteMapping("/room/{id}")
    public @ResponseBody void deleteRoom(@PathVariable int id) {
        var room = roomRepository.findById(id);
        if (room.isPresent()){
            roomRepository.deleteById(id);
        }
    }

    @PutMapping("/room/{id}")
    public @ResponseBody Room updateRoom(@RequestBody Room newRoom, @PathVariable Integer id) {
        var room_ = roomRepository.findById(id)
                .map(room -> {
                    room.setId_room(newRoom.getId_room());
                    room.setId_dorm(newRoom.getId_dorm());
                    return roomRepository.save(room);
                })
                .orElseGet(() -> {
                    return roomRepository.save(newRoom);
                });
        return room_;
    }
}