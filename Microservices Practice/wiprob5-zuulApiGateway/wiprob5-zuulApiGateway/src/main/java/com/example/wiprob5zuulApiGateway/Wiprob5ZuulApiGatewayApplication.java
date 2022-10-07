package com.example.wiprob5zuulApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Wiprob5ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wiprob5ZuulApiGatewayApplication.class, args);
	}

}
