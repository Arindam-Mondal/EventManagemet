package com.event.eventmgt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/API"})
public class UserController {
	
	@RequestMapping({"/HealthCheck"})
	public String healthCheck()
	{
		return "OK";
	}
}