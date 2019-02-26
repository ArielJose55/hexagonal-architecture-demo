package co.com.ceiba.phman.domain.services.user;

import java.util.Optional;

import co.com.ceiba.phman.domain.models.User;

public interface IUserRepository {

	public Optional<User> save(User user);
	
}
