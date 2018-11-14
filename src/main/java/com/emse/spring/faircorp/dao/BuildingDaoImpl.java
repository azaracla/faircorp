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
    public List<Light> findBuildingLights(Integer buildingId) {
        return null;
    }
}
