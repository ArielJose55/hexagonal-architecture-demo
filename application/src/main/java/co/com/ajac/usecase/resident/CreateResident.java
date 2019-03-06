package co.com.ajac.usecase.resident;

import java.util.Optional;

import co.com.ajac.models.ErrorResponse;
import co.com.ajac.models.core.Resident;
import co.com.ajac.services.resident.ResidentService;
import co.com.ajac.usecase.Command;
import co.com.ajac.usecase.Receiver;

public class CreateResident implements Command{

	private final Resident resident;
	
	private final ResidentService residentService;
	
	/**
	 * @param resident
	 * @param residentService
	 */
	public CreateResident( ResidentService residentService, Resident resident) {
		this.resident = resident;
		this.residentService = residentService;
	}

	@Override
	public Receiver execute() {
		Optional<Resident> residentSave = residentService.create(resident);
		if(residentSave.isPresent()) {
			return new Receiver(residentSave.get());
		}
		return new Receiver(new ErrorResponse(409, "Ouups! No fue posible crear o almacenar este residente"));
	}

}
