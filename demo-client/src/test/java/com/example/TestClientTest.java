package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by abinetsky on 20.01.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class TestClientTest {
    @Autowired
    TestClient testClient;

    @Test
    public void testAll() {
        final Stick stick = new Stick();
        stick.setName("aaa");
        testClient.create(stick);
        stick.setName("bbb");
        testClient.create(stick);

        final String sticks = testClient.sticks(Arrays.asList(1L, 2L));

        System.out.println(sticks);

        //final List<Stick> sticks2 = testClient.sticks(Arrays.asList(1L, 2L));
        //assertEquals(2, sticks.size());

    }

}