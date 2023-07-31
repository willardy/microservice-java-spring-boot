package com.microservice.rhfolhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class RhFolhaDePagamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhFolhaDePagamentoApplication.class, args);
    }

}
