package com.sunshine.quote.events;

import com.sunshine.quote.dao.QuoteRepository;
import com.sunshine.quote.entity.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fanida on 18-03-23.
 */

@RefreshScope
@RestController
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    @Value("${server.email}")
    private String message;

    @GetMapping(value = "/hello")
    public String hello () {
        return message;
    }

    @GetMapping(value = "/quotes")
    public List<Quote> all () {
        return quoteRepository.findAll();
    }
}
