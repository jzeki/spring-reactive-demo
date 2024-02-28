package com.webflux.controller;

import com.webflux.model.Person;
import com.webflux.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {

    @Autowired
    private PersonServiceImpl employeeService;

    @RequestMapping(value = { "/create", "/" }, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Person e) {
        employeeService.create(e);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Mono<Person>> findById(@PathVariable("id") Integer id) {
        Mono<Person> e = employeeService.findById(id);
        return new ResponseEntity<Mono<Person>>(e, HttpStatus.OK);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Flux<Person> findByName(@PathVariable("name") String name) {
        return employeeService.findByName(name);
    }

    @RequestMapping(value = { "/" }, method = RequestMethod.GET, produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Person> findAll() {
        Flux<Person> emps = employeeService.findAll();
        return emps;
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public Mono<Person> update(@RequestBody Person e) {
        return employeeService.update(e);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id) {
        employeeService.delete(id).subscribe();
    }

}