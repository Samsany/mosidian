package io.mosidian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class MosidianAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MosidianAdminApplication.class, args);
	}

}