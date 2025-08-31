
package com.hcl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hcl.main")
public class EcommerceSiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcommerceSiteApplication.class, args);
	}
}
