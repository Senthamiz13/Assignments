package com.zuuldemo.APIgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIgatewayApplication.class, args);
	}

}
