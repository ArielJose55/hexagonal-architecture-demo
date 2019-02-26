package co.com.ceiba.phman.application.usecase.user;

import co.com.ceiba.phman.application.usecase.Command;
import co.com.ceiba.phman.application.usecase.Receiver;
import co.com.ceiba.phman.domain.models.User;
import co.com.ceiba.phman.domain.services.user.UserService;

public class RegisterUser implements Command{

	private Receiver receiver;
	
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
	public void execute() {
		
	}

	@Override
	public Receiver action() {
		return null;
	}

}
