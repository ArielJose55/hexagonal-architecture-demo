package co.com.ajac.models.access;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import co.com.ajac.models.Model;
import co.com.ajac.models.core.NaturalPerson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BiometricData implements Model {

	private static final String CAMPO_NO_PUEDE_SER_VACIO = "Este campo no puede estar vacío";

	@NotEmpty(message = CAMPO_NO_PUEDE_SER_VACIO)
	private String fingerprint;
	
	@NotEmpty(message = CAMPO_NO_PUEDE_SER_VACIO)
	private String securityCode;
	
	@NotNull(message = CAMPO_NO_PUEDE_SER_VACIO)
	private NaturalPerson naturalPerson;
}
