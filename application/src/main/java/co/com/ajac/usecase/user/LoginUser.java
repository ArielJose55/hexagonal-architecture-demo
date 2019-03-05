package co.com.ajac.usecase.user;

import java.util.Optional;

import co.com.ajac.models.ErrorResponse;
import co.com.ajac.models.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.Command;
import co.com.ajac.usecase.Receiver;

public class LoginUser implements Command{
	
	private final UserService userService;
	
	private final String username;
	
	private final String password;
	
	/**
	 * @param personService
	 * @param user
	 */
	public LoginUser(UserService userService, String username, String password) {
		this.userService = userService;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public Receiver execute() {
		
		Optional<User> userSave = userService.login(username, password);
		
		if(userSave.isPresent()) {
			return new Receiver(userSave.get());
		}
		
		return new Receiver (new ErrorResponse(409, "Uoops! Constraseña o el password incorrectas."));
	}

}
