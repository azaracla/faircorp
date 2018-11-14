package com.emse.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Room {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer floor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
    private Set<Light> lights;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buildingId")
    private Building building;

    public Room() {
    }

    public Room(Building building, String name, Integer floor) {
        this.name = name;
        this.floor = floor;
        this.building = building;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Set<Light> getLights() {
        return lights;
    }

    public Long getBuildingId() {
        return building.getId();
    }
}
