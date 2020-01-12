package com.ccz.xingtian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@ServletComponentScan
@MapperScan("com.ccz.xingtian.mapper")
public class XingtianApplication {

	public static void main(String[] args) {
		SpringApplication.run(XingtianApplication.class, args);
	}

}
