package org.example.soft_delete_sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.package1", "com.example.package2"})
public class SoftDeleteSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftDeleteSandboxApplication.class, args);
	}

}
