package co.com.ajac.usecase.user;

import java.util.Optional;

//import org.springframework.stereotype.Component;

import co.com.ajac.models.ErrorResponse;
import co.com.ajac.models.core.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.Command;
import co.com.ajac.usecase.Receiver;

//@Component
public class RegisterUser implements Command{
	
	private UserService userService;
	
	private User user;
	
	/**
	 * @param personService
	 * @param user
	 */
	public RegisterUser(UserService userService, User user) {
		super();
		this.userService = userService;
		this.user = user;
	}

	@Override
	public Receiver execute() {
		Optional<User> userSave = userService.registerUser(user);
		
		if(userSave.isPresent()) {
			return new Receiver(userSave.get());
		}
		
		return new Receiver (new ErrorResponse(409, "Uoops! La solicitud no pudo ser completada. Por favor, intentelo de nuevo"));
	}

}
