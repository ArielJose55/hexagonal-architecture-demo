package co.com.ajac.database.repositories.user;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ajac.models.User;


@Repository
public class UserRepository {

	@Autowired
	private Jdbi jdbi;

	public User create(User user) {
		User findOnly = null;
		try (Handle handle = jdbi.open()) {
			findOnly = handle.createUpdate("INSERT INTO public.\"USER\"(person_fk, username, password, register_date) VALUES (:identification, :username, ':password, :registerDate)")
				.bindBean(user)
				.executeAndReturnGeneratedKeys()
				.mapToBean(User.class)
				.findOnly();
		}
		return findOnly;
	}

	
	public User login(String username, String password) {
		User findOnly = null;
		
		try (Handle handle = jdbi.open()) {
			findOnly = handle.createQuery("SELECT * FROM public.\"USER\" WHERE username = :username AND password = :password")
				.bind("username", username)
				.bind("password", password)
				.mapToBean(User.class)
				.findOnly();
		}
		return findOnly;
	}
}
