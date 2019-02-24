package co.com.ceiba.phman.infraestructure.api.spring.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.phman.domain.models.User;

@RestController
public class UserController {

	@PostMapping
	public void addUser(@RequestBody User user) {
		
	}
}
