package org.springboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableEurekaServer
@EnableAdminServer
@SpringBootApplication
public class SpringbootAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdmin.class, args);
    }
}