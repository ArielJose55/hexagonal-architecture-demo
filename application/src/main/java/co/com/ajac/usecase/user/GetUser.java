package co.com.ajac.usecase.user;

import java.util.Optional;

import co.com.ajac.models.ErrorResponse;
import co.com.ajac.models.core.User;
import co.com.ajac.services.user.UserService;
import co.com.ajac.usecase.Command;
import co.com.ajac.usecase.Receiver;

public class GetUser implements Command{

	private final String identification;
	
	private final UserService userService;
	
	/**
	 * @param identification
	 */
	public GetUser(UserService userService,String identification) {
		this.identification = identification;
		this.userService = userService;
	}

	@Override
	public Receiver execute() {
		Optional<User> user = userService.get(identification);
		
		if(user.isPresent()) {
			return new Receiver(user.get());
		}
		
		return new Receiver(new ErrorResponse(409, "No existe un usuario con esta identificacion"));
	}
}
