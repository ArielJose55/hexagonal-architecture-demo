package co.com.ajac.http.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ajac.models.core.Resident;
import co.com.ajac.usecase.resident.CreateResident;
import co.com.ajac.usecase.resident.GetResident;

@RestController
@RequestMapping("/residents")
public class ResidentController {
	
	@Autowired
	private CreateResident createResident;
	
	@Autowired
	private GetResident getResident;
	
	@PostMapping
	public Optional<Resident> add(@Valid @RequestBody Resident resident) {
		return createResident.execute(resident);
	}
	
	@GetMapping("/{id}")
	public Optional<Resident> get(@PathVariable("id") String identification) {
		return getResident.execute(identification);
	}
}
