package com.sunshine.quote.webquoteconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WebQuoteConfigApplication {

    public static void main (String[] args) {
        SpringApplication.run(WebQuoteConfigApplication.class, args);
    }
}
