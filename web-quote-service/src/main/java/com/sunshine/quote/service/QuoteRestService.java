package com.sunshine.quote.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanida on 18-03-23.
 */

@RefreshScope
@RestController
public class QuoteRestService {


    @Value("${server.email}")
    private  String message;

    @GetMapping(value = "/hello")
    public String hello(){
        return message;
    }
}
