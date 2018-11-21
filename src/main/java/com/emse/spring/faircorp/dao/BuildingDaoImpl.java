package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Light;
import com.emse.spring.faircorp.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BuildingDaoImpl implements BuildingDaoCustom{
    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Light> findBuildingLights(Long buildingId) {
        String jpql = "select lt from Light lt left join lt.room r where r.building.id = :value";
        return em.createQuery(jpql, Light.class)
                .setParameter("value", buildingId)
                .getResultList();
    }

    @Override
    public List<Room> findRooms(Long buildingId) {
        String jpql = "select rm from Room rm where rm.building.id = :value";
        return em.createQuery(jpql, Room.class)
                .setParameter("value", buildingId)
                .getResultList();
    }
}
