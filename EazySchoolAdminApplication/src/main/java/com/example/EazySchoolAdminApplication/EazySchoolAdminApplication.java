package com.example.EazySchoolAdminApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class EazySchoolAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazySchoolAdminApplication.class, args);
	}

}
