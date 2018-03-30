package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan("com.winter.mapper")
@EnableTransactionManagement
public class MybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

}
