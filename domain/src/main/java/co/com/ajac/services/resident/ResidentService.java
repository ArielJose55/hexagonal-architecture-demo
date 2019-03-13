package co.com.ajac.services.resident;

import java.util.Optional;

import co.com.ajac.models.core.Resident;
import co.com.ajac.ports.IResidentRepository;

public class ResidentService {

	private final IResidentRepository repository;
	
	/**
	 * @param repository
	 */
	public ResidentService(IResidentRepository repository) {
		this.repository = repository;
	}

	public Optional<Resident> create(Resident resident){
		return repository.save(resident);
	}
	
	public Optional<Resident> get(String identification){
		return repository.get(identification);
	}
}
