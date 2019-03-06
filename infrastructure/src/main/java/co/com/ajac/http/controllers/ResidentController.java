package co.com.ajac.http.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ajac.database.adapters.ResidentRepositoryAdapter;
import co.com.ajac.models.Model;
import co.com.ajac.models.core.Resident;
import co.com.ajac.services.resident.ResidentService;
import co.com.ajac.usecase.resident.CreateResident;

@RestController
@RequestMapping("/residents")
public class ResidentController {

	@Autowired
	private InvokerCommand invokeCommand;
	
	@Autowired
	private ResidentRepositoryAdapter repository;
	
	@PostMapping
	public Model add(@Valid @RequestBody Resident resident) {
		return invokeCommand.run(new CreateResident(new ResidentService(repository), resident));
	}
}
