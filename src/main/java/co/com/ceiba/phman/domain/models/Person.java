package co.com.ceiba.phman.domain.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

	private static final String OUUPS_LO_SIENTO_PERO_LA_IDENTIFICACION = "¡Ouups! Lo siento, pero la identificación no puede estar vacía";
	
	@NotNull(message=OUUPS_LO_SIENTO_PERO_LA_IDENTIFICACION)
	@Size(min=5, max=20)
	private String identification;
	private String typeIdentification;
}
