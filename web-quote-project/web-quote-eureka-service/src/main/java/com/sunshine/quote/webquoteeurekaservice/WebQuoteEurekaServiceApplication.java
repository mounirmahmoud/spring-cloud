package com.sunshine.quote.webquoteeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class WebQuoteEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebQuoteEurekaServiceApplication.class, args);
	}
}
