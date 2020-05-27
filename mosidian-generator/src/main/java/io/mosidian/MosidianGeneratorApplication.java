package io.mosidian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZSY
 */
@SpringBootApplication
@MapperScan("io.mosidian.dao")
public class MosidianGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MosidianGeneratorApplication.class, args);
	}
}
