package org.springboot.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SpringbootAdmin {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdmin.class, args);
    }
}