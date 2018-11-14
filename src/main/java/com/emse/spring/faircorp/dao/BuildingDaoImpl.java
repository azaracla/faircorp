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
}
