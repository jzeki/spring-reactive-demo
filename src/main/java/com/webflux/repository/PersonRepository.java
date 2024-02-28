package com.webflux.repository;

import com.webflux.model.Person;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, Integer> {

    @Query("{ 'name': ?0 }")
    Flux<Person> findByName(final String name);
}