package com.study.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "event")
public class Entity {
    @Id
    @Column(name = "id")
    private int id;

    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name="entity_class")
    private String entityClass;

    @Column(name="entity")
    private String entity;
}
