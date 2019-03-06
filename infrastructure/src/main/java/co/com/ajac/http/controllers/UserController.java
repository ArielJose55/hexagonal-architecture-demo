package co.com.ajac.http.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ajac.database.adapters.UserRepositoryAdapter;
import co.com.ajac.models.Model;
import co.com.ajac.models.core.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.user.GetUser;
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
	public Model add(@Valid @RequestBody User user) {
		return invokeCommand.run(new RegisterUser(new UserService(userRepository), user));
	}
	
	@PostMapping("/login")
	public Model login(@RequestParam String username, @RequestParam String password) {
		return invokeCommand.run(new LoginUser(new UserService(userRepository), username, password));
	}
	
	@GetMapping("/{id}")
	public Model get(@PathVariable("id") String identification) {
		return invokeCommand.run(new GetUser(new UserService(userRepository), identification));
	}
}
