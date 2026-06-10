package com.acme.eurekaservercafelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCafelabApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCafelabApplication.class, args);
    }

}
