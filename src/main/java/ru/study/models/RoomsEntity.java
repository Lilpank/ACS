package ru.study.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rooms")
public class RoomsEntity {
    @Id
    @Column(name = "id_room")
    private int id_room;

    @Column(name = "id_dorm")
    private int id_dorm;
}
