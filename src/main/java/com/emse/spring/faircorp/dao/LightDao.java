package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Light;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LightDao extends JpaRepository<Light, Long>, LightDaoCustom {

    //List<Light> findByRoomId(Long roomId);


}
