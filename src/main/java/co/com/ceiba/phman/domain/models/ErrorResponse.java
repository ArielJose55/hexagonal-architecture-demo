package co.com.ceiba.phman.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Class to encapsulate domain errors
 * 
 * @author ariel.arnedo
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
	private Integer code;
	private String message;
	private String description;
}
