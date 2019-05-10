package com.example.demospringboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyConfigTest {

    @Autowired
    private MyConfig myConfig;

    @Test
    public void test() {
        System.out.println("myConfig.foo = " + myConfig.getFoo());
        System.out.println("myConfig.bar = " + myConfig.getBar());
    }
}
