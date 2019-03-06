package co.com.ajac.ports;

import java.util.Optional;

import co.com.ajac.models.core.Pet;
import co.com.ajac.models.core.Resident;

public interface IResidentRepository {
	
	public Optional<Resident> save(Resident resident);
	
	public Optional<Resident> get(String identification);
	
	public Optional<Pet> addHimPet(Pet pet, String onwerIdentification);
}
