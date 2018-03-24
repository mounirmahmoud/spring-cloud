package com.sunshine.quote;

import com.sunshine.quote.dao.QuoteRepository;
import com.sunshine.quote.entity.Quote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.stream.Stream;

@SpringBootApplication
public class WebQuoteServiceApplication {

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(WebQuoteServiceApplication.class, args);
        QuoteRepository quoteRepository = ctx.getBean(QuoteRepository.class);

        Stream.of(
                "Quote 1", "Quote2", "Quote3"
        ).forEach(s->quoteRepository.save(new Quote(s)));
        quoteRepository.findAll().forEach(s->System.out.println(s.getDescription()));


	}
}
