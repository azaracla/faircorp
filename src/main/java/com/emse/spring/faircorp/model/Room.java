package com.emse.spring.faircorp.model;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private long Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer floor;

    public Room() {
    }

    public Room(String name, Integer floor) {
        this.name = name;
        this.floor = floor;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
