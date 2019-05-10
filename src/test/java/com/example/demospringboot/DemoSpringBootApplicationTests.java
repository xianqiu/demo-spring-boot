package com.example.demospringboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringBootApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testLogger() {
        log.info("Logger is OK");
        log.error("Logger is OK");
    }

}
