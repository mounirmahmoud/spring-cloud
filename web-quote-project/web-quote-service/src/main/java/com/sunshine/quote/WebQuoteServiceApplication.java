package com.sunshine.quote;

import com.sunshine.quote.dao.QuoteRepository;
import com.sunshine.quote.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import java.util.stream.Stream;


@SpringBootApplication
@EnableDiscoveryClient
public class WebQuoteServiceApplication {


    public static void main(String[] args) {
	 SpringApplication.run(WebQuoteServiceApplication.class, args);
	}
}
