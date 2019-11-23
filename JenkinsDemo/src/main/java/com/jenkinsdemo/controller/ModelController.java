package com.jenkinsdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

	@GetMapping(path="/app/index/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getApp(@PathVariable String name) {
		return "Hello, "+name;
	}
	
}
