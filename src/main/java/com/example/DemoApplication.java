package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@EnableJpaRepositories("com.example.*")
@ComponentScan(basePackages = { "com.example.*" })
@EntityScan("com.example.*")*/
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
