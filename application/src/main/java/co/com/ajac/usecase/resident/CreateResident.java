package co.com.ajac.usecase.resident;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.models.core.Resident;
import co.com.ajac.services.resident.ResidentService;
import co.com.ajac.usecase.Command;


@Component
public class CreateResident implements Command<Resident,Resident>{
	
	private final ResidentService residentService;

	@Autowired
	public CreateResident(ResidentService residentService) {
		this.residentService = residentService;
	}

	@Override
	public Optional<Resident> execute(Resident resident) {
		return residentService.create(resident);
	}

}
