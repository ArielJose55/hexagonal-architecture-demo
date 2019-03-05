package co.com.ajac.http.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ajac.database.adapters.UserRepositoryAdapter;
import co.com.ajac.models.Model;
import co.com.ajac.models.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.user.LoginUser;
import co.com.ajac.usecase.user.RegisterUser;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private InvokerCommand invokeCommand;
	
	@Autowired
	private UserRepositoryAdapter userRepository;
	
	@PostMapping
	public Model addUser(@Valid @RequestBody User user) {
		return invokeCommand.run(new RegisterUser(new UserService(userRepository), user));
	}
	
	@PostMapping("/login")
	public Model login(@RequestParam String username, @RequestParam String password) {
		return invokeCommand.run(new LoginUser(new UserService(userRepository), username, password));
	}
}
