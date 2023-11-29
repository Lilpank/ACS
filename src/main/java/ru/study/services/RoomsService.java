package ru.study.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import ru.study.models.RoomsEntity;
import ru.study.models.dto.RoomsRequest;
import ru.study.repositories.RoomsRepository;

import java.util.List;

@Stateless
public class RoomsService {
    @Inject
    private RoomsRepository roomsService;


    public List<RoomsEntity> getAll() {
        return roomsService.findAll();
    }

    public void create(RoomsRequest roomsRequest) {
        RoomsEntity room = new RoomsEntity(roomsRequest.getId_room(), roomsRequest.getId_dorm());
        roomsService.persist(room);
    }
}