package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RoomDaoImpl implements RoomDaoCustom{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Room> findOnName(String name) {
        String jpql = "select rm from Room rm where rm.name = :value";
        return em.createQuery(jpql, Room.class)
                .setParameter("value", name)
                .getResultList();
    }
}
