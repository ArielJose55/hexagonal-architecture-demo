package co.com.ajac.services.user;

import java.util.Optional;

import co.com.ajac.models.core.User;
import co.com.ajac.ports.IUserRepository;


public class UserService {

	private IUserRepository userRepository;
	
	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Optional<User> registerUser(User user){
		return userRepository.save(user);
	}
	
	public Optional<User> login(String username, String password){
		return userRepository.login(username, password);
	}
	
	public Optional<User> findOneBy(String identification){
		return userRepository.get(identification);
	}
}
