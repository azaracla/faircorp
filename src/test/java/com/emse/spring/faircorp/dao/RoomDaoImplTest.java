package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan
public class RoomDaoImplTest {


    @Autowired
    RoomDao roomDao;

    @Test
    public void findOnName() {
        assertThat(roomDao.findByName("Room1").getId()).isEqualTo(-10L);
    }
}