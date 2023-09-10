package in.stackroute.API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Enable the service registry and start Eureka Server
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}