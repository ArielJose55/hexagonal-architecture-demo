package co.com.ceiba.phman.domain.models;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class NaturalPerson extends Person {

	@NotNull
	private String name;
	
	@NotNull
	private String lastName;
}
