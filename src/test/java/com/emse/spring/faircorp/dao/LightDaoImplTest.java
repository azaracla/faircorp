package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan
public class LightDaoImplTest {

    @Autowired
    LightDaoCustom lightDao;

    @Test
    public void shouldFindOnLights() {
        assertThat(lightDao.findOnLights()).hasSize(1)
                .extracting("id", "status")
                .containsExactly(tuple(-1L, Status.ON));
    }

    @Test
    public void findByRoom() {
        assertThat(lightDao.findByRoom(-10L)).hasSize(2)
                .extracting("id", "level", "status", "roomId")
                .containsExactlyInAnyOrder(tuple(-1L, 8, Status.ON, -10L), tuple(-2L, 0, Status.OFF, -10L));
    }
}