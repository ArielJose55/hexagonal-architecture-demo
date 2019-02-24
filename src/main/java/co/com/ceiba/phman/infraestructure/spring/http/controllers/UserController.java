package co.com.ceiba.phman.infraestructure.spring.http.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.phman.domain.models.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping
	public String addUser(@RequestBody User user) {
		System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLL");
		return "deffefefffef";
	}
	
	@GetMapping
	public String hello() {
		return "Hola";
	}
}
