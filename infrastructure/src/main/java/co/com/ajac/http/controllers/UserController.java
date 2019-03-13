package co.com.ajac.http.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ajac.models.core.User;
import co.com.ajac.usecase.user.GetUser;
import co.com.ajac.usecase.user.LoginUser;
import co.com.ajac.usecase.user.RegisterUser;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private RegisterUser registerUser;
	
	@Autowired
	private LoginUser loginUser;
	
	@Autowired
	private GetUser getUser;
	
	@PostMapping
	public Optional<User> add(@Valid @RequestBody User user) {
		return registerUser.execute(user);
	}
	
	@PostMapping("/login")
	public Optional<User> login(@RequestParam String username, @RequestParam String password) {
		Map<String, String> params = new HashMap<>();
		params.put("username", username);
		params.put("password", password);
		return loginUser.execute(params);
	}
	
	@GetMapping("/{id}")
	public Optional<User> get(@PathVariable("id") String identification) {
		return getUser.execute(identification);
	}
}
