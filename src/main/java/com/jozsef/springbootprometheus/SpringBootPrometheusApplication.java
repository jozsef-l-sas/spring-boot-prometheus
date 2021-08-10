package com.jozsef.springbootprometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootPrometheusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPrometheusApplication.class, args);
    }

}
