package co.com.ajac.database.adapters;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ajac.database.repositories.resident.ResidentRepository;
import co.com.ajac.models.core.Pet;
import co.com.ajac.models.core.Resident;
import co.com.ajac.ports.IResidentRepository;

@Component
public class ResidentRepositoryAdapter implements IResidentRepository{

	@Autowired
	private ResidentRepository repository;

	@Override
	public Optional<Resident> save(Resident resident) {
		return Optional.ofNullable(repository.create(resident));
	}

	@Override
	public Optional<Resident> get(String identification) {
		return Optional.ofNullable(repository.get(identification));
	}

	@Override
	public Optional<Pet> addHimPet(Pet pet, String onwerIdentification) {
		return Optional.ofNullable(repository.addHimPet(pet, onwerIdentification));
	}
	
	
}
