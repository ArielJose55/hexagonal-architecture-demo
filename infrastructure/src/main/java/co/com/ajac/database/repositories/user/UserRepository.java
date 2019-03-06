package co.com.ajac.database.repositories.user;

import java.util.List;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ajac.models.core.User;


@Repository
public class UserRepository {

	@Autowired
	private Jdbi jdbi;

	public User create(User user) {
		User findOnly = null;
		try (Handle handle = jdbi.open()) {
			findOnly = handle.createUpdate("INSERT INTO \"USER\"(person_fk, username, password, register_date) VALUES (:identification, :username, ':password, :registerDate)")
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
			findOnly = handle.createQuery("SELECT * FROM \"USER\" WHERE username = :username AND password = :password")
				.bind("username", username)
				.bind("password", password)
				.mapToBean(User.class)
				.findOnly();
		}
		return findOnly;
	}
	

	public User get(String identification) {
		User findOnly = null;
		
		try (Handle handle = jdbi.open()) {
			findOnly = handle.createQuery("SELECT p.identification,p.\"typeIdentification\" ,u.person_fk, u.username, u.\"password\", u.register_date FROM \"USER\" u JOIN \"PERSON\" p ON u.person_fk = p.identification WHERE u.person_fk = :identification")
				.bind("identification", identification)
				.mapToBean(User.class)
				.findOnly();
		}
		return findOnly;
	}

	
	public List<User> findUserActives(){
		List<User> users = null;
		
		try(Handle handle = jdbi.open()){
			users = handle.createQuery("")
				.bind("state", "ACTIVE")
				.mapToBean(User.class)
				.list();
		}
		return users;
	}
}
