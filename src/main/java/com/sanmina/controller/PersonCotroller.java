package com.sanmina.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanmina.model.Person;

@RestController
public class PersonCotroller {

	@RequestMapping(value="/search", produces={MediaType.APPLICATION_JSON_VALUE})
	public Person search(String personName){
		return new Person(personName, 32, "guangdong");
	}
	
}
