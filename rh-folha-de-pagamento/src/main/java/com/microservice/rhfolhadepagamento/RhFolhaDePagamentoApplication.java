package com.microservice.rhfolhadepagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@RibbonClient(name = "rh-funcionarios")
@SpringBootApplication
@EnableFeignClients
public class RhFolhaDePagamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhFolhaDePagamentoApplication.class, args);
    }

}
