package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Light;
import com.emse.spring.faircorp.model.Status;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LightDaoImpl implements LightDaoCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Light> findOnLights() {
        String jpql = "select lt from Light lt where lt.status = :value";
        return em.createQuery(jpql, Light.class)
                 .setParameter("value", Status.ON)
                 .getResultList();
    }

    @Override
    public List<Light> findByRoom(Long roomId) {
        String jpql = "select lt from Light lt where lt.room.id = :value";
        return em.createQuery(jpql, Light.class)
                .setParameter("value", roomId)
                .getResultList();
    }
}
