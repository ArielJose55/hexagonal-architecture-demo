package co.com.ajac.usecase;

import co.com.ajac.models.Model;

public class Receiver{
	
	private final Model response;

	/**
	 * @param response
	 */
	public Receiver(Model response) {
		super();
		this.response = response;
	}

	public Model getResponse() {
		return response;
	}
}
