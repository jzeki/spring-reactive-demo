package com.webflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Document
@Document(collection = "person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    String id;
    String name;
    int age;

    //Getters and setters

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}