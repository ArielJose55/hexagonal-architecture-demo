package co.com.ceiba.phman.domain.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User extends Person implements Model{

	private static final String FIELD_NOT_EMPLY = "Este campo no puede estar vacío";

	private static final String CONTRASENA_PATTERN_VALIDATE = "Password solo debe contener caracteres alfanuméricos";

	private static final String USERNAME_PATTERN_VALIDATE = "Username solo debe contener caracteres alfanuméricos";

	private static final String USERNAME_MESSAGE_VALIDATE = "La contraseña debe tener una longitud de entre 5 y 20 caracteres";

	private static final String CONTRASENA_MESSAGE_VALIDATE = "El password debe tener una longitud de entre 5 y 20 caracteres";

	@NotEmpty(message = FIELD_NOT_EMPLY)
	@Size(min = 5, max = 20, message = USERNAME_MESSAGE_VALIDATE)
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9-_]{5,20}", message = USERNAME_PATTERN_VALIDATE)
	private String username;
	
	@NotEmpty(message = FIELD_NOT_EMPLY)
	@Size(min = 5, max = 20, message = CONTRASENA_MESSAGE_VALIDATE)
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9-_]{5,20}", message = CONTRASENA_PATTERN_VALIDATE)
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