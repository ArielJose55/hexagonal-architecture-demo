package co.com.ceiba.phman.domain.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User extends Person {

	@NotEmpty(message = "sihjkl")
	@Size(min = 5, max = 20, message = "frfrf")
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9-_]{5,20}", message = "jjfr")
	private String username;
	
	@NotEmpty(message = "")
	@Size(min = 5, max = 20, message = "frf")
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9-_]{5,20}", message = "jjfr")
	private String password;

	/**
	 * @param identification
	 * @param typeIdentification
	 */
	public User(String identification, String typeIdentification) {
		super(identification, typeIdentification);
	}	
	
	/**
	 * 
	 * @param identification
	 * @param typeIdentification
	 * @param username
	 * @param password
	 */
	public User(String identification, String typeIdentification, String username, String password) {
		super(identification, typeIdentification);
		this.username = username;
		this.password = password;
	}
}