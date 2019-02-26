package co.com.ceiba.phman.domain.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

	private static final String OUUPS_LO_SIENTO_PERO_LA_IDENTIFICACION = "�Ouups! Lo siento, pero la identificaci�n no puede estar vac�a";
	
	@NotNull(message=OUUPS_LO_SIENTO_PERO_LA_IDENTIFICACION)
	@Size(min=5, max=20, message = "")
	protected String identification;
	
	@NotNull
	protected String typeIdentification;
}
