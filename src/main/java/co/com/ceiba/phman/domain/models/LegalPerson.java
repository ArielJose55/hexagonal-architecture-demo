package co.com.ceiba.phman.domain.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class LegalPerson extends Person{
	private String businessName;
}
