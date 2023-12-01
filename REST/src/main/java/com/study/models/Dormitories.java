package com.study.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dormitories")
public class Dormitories {
    @Id
    @Column(name = "university")
    private String university;

    @Column(name = "id_dorm")
    private int id_dorm;
}
