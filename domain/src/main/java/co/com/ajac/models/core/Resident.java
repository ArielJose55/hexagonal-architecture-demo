package co.com.ajac.models.core;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Resident extends NaturalPerson {

	private String type;
	
	public Resident(String identification, String typeIdentification) {
		super(identification, typeIdentification);
	}

	/**
	 * @param identification
	 * @param typeIdentification
	 * @param name
	 * @param lastName
	 */
	public Resident(String identification, String typeIdentification, String name, String lastName) {
		super(identification, typeIdentification, name, lastName);
	}
}
