package co.com.ajac.usecase.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.models.core.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.Command;


@Component
public class RegisterUser implements Command <User, User>{
	
	private final UserService userService;

	@Autowired
	public RegisterUser(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Optional<User> execute( User user ) {
		return userService.registerUser(user);
	}
}
