package com.study.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room {
    @Column(name = "id_room")
    private int id_room;

    @Id
    @Column(name = "id_dorm")
    private int id_dorm;
}


