package com.webflux.service;

import com.webflux.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService
{
    void create(Person e);

    Mono<Person> findById(Integer id);

    Flux<Person> findByName(String name);

    Flux<Person> findAll();

    Mono<Person> update(Person e);

    Mono<Void> delete(Integer id);
}