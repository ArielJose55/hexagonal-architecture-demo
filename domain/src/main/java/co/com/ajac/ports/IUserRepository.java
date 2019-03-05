package co.com.ajac.ports;

import java.util.Optional;

import co.com.ajac.models.User;

public interface IUserRepository {

	public Optional<User> save(User user);
	
	public Optional<User> login(String username, String password);
	
	public Optional<User> get(String identification);
}
