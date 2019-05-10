package com.example.demospringboot;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class MyConfig {

    @Value("${myConfig.foo}")
    private String foo;
    @Value("${myConfig.bar}")
    private String bar;

}
