package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * Created by abinetsky on 20.01.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class TestClientTest {
    @Autowired
    RestClient testClient;

    @Test
    public void testAll() {
        final Stick stick = new Stick();
        stick.setId(1l);
        stick.setName("aaa");
        testClient.create(stick);
        stick.setId(2l);
        stick.setName("bbb");
        testClient.create(stick);

        final String sticks = testClient.sticks(Arrays.asList(1L, 2L));
    }

}