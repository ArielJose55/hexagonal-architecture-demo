package co.com.ajac.http.controllers;

import org.springframework.stereotype.Component;

import co.com.ajac.models.Model;
import co.com.ajac.usecase.Command;

@Component
public final class InvokerCommand {
	
	public Model run (Command command){
		return command.execute().getResponse();
	}
}
