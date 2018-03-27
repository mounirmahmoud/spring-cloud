package com.sunshine.quote.dao;

import com.sunshine.quote.entity.Quote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by fanida on 18-03-23.
 */

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {

    @Query("select q from Quote q where q.id like:id")
    public Page<Quote> quoteById(@Param("id") String id, Pageable pageable);

    @Query("select q from Quote q where q.description like:description")
    public Page<Quote> quoteByDescription(@Param("description") String description, Pageable pageable);

}