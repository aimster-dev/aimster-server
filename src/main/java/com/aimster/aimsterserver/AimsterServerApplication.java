package com.aimster.aimsterserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aimster.aimsterserver.mappers")
public class AimsterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AimsterServerApplication.class, args);
	}

}
