package co.com.ajac.usecase.user;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.exceptions.ViolatedValidationException;
import co.com.ajac.models.core.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.Command;

@Component
public class LoginUser implements Command < User, Map<String, String> >{
	
	private final UserService userService;

	@Autowired
	public LoginUser(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Optional<User> execute(Map<String, String> query) {
		
		if(query.get("username") == null || query.get("password") == null) {
			throw new ViolatedValidationException("Campos de username y password son requeridos");
		}
		
		return userService.login( query.get("username"), query.get("password"));
	}
	
}
