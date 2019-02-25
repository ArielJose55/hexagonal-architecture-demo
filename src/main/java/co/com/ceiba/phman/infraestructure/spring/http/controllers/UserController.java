package co.com.ceiba.phman.infraestructure.spring.http.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.ceiba.phman.domain.models.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@PostMapping
	public String addUser(@Valid @RequestBody User user) {
		return "deffefefffef";
	}
	
	@GetMapping
	public String hello() {
		return "Hola";
	}
}
