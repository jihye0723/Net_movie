package com.example.netmovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Auditing 어노테이션 모두 활성화 
@SpringBootApplication
public class NetMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetMovieApplication.class, args);
	}

}
