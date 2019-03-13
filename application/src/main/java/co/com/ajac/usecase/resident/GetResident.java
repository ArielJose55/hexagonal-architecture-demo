package co.com.ajac.usecase.resident;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.models.core.Resident;
import co.com.ajac.services.resident.ResidentService;
import co.com.ajac.usecase.Command;

@Component
public class GetResident implements Command<Resident, String> {

	private final ResidentService residentService;

	@Autowired
	public GetResident(ResidentService residentService) {
		this.residentService = residentService;
	}

	@Override
	public Optional<Resident> execute(String identification) {
		return residentService.get(identification);
	}
	
}
