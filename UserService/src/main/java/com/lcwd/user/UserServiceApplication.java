package com.lcwd.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(UserServiceApplication.class, args);

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
