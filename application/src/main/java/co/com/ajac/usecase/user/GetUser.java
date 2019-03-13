package co.com.ajac.usecase.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.models.core.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.Command;


@Component
public class GetUser implements Command <User, String>{
	
	private final UserService userService;
	
	@Autowired
	public GetUser(UserService userService) {
		this.userService = userService;
	}

	@Override
	public Optional<User> execute( String identification ) {
		return userService.findOneBy(identification);
	}
}
