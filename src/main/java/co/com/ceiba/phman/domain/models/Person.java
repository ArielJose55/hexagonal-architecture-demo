package co.com.ceiba.phman.domain.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public abstract class Person {

	private static final String OUUPS_LO_SIENTO_PERO_LA_IDENTIFICACION = "¡Ouups! Lo siento, pero la identificación no puede estar vacía";
	
	@NotNull(message=OUUPS_LO_SIENTO_PERO_LA_IDENTIFICACION)
	@Size(min=5, max=20)
	private String identification;
	
	@NotNull
	private String typeIdentification;
}
