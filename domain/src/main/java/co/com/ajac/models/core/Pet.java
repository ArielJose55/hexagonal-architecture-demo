package co.com.ajac.models.core;

import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pet {

	@NotEmpty
	private String name;
	
	@NotEmpty
	private String species;
	
	private NaturalPerson identification;
}
