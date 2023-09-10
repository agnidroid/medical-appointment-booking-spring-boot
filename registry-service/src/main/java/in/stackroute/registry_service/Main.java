package in.stackroute.registry_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Enable the service registry and start Eureka Server
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}