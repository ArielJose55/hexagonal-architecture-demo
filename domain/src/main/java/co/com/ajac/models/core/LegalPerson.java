package co.com.ajac.models.core;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class LegalPerson extends Person {

	private String businessName;
	
	public LegalPerson(String identification, String typeIdentification) {
		super(identification, typeIdentification);
	}
}
