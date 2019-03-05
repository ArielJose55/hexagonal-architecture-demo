package co.com.ajac.database.adapters;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.database.repositories.user.UserRepository;
import co.com.ajac.models.User;
import co.com.ajac.ports.IUserRepository;

@Component
public class UserRepositoryAdapter implements IUserRepository{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Optional<User> save(User user) {
		return Optional.ofNullable(userRepository.create(user));
	}

	@Override
	public Optional<User> login(String username, String password) {
		return Optional.ofNullable(userRepository.login(username, password));
	}

	@Override
	public Optional<User> get(String identification) {
		return Optional.ofNullable(userRepository.get(identification));
	}

}
