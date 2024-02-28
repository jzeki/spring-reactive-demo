package com.webflux.service;

import com.webflux.model.Person;
import com.webflux.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    public void create(Person e) {
        personRepository.save(e).subscribe();
    }

    public Mono<Person> findById(Integer id) {
        return personRepository.findById(id);
    }

    public Flux<Person> findByName(String name) {
        return personRepository.findByName(name);
    }

    public Flux<Person> findAll() {
        return personRepository.findAll();
    }

    public Mono<Person> update(Person e) {
        return personRepository.save(e);
    }

    public Mono<Void> delete(Integer id) {
        return personRepository.deleteById(id);
    }

}