package com.microservice.rhfuncionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhFuncionariosApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhFuncionariosApplication.class, args);
    }

}
