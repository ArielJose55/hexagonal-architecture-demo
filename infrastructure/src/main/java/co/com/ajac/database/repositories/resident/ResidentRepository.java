package co.com.ajac.database.repositories.resident;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ajac.models.core.Pet;
import co.com.ajac.models.core.Resident;

@Repository
public class ResidentRepository {

	@Autowired
	private Jdbi jdbi;


	public Resident create(Resident model) {

		try(Handle handle = jdbi.open()) {
			handle.inTransaction(h -> {
				String identification = h.createUpdate("INSERT INTO \"PERSON\"(identification, \"typeIdentification\") VALUES (:identification, :typeIdentification)")
						.bind("identification", model.getIdentification())
						.bind("typeIdentification", model.getTypeIdentification())
						.executeAndReturnGeneratedKeys("identification")
						.toString();
				h.createUpdate("INSERT INTO \"NATURAL_PERSON\"( name, last_name, person_fk)	VALUES (:name, :last_name, :person_fk)")
						.bind("name", model.getName())
						.bind("last_name", model.getLastName())
						.bind("person_fk", identification)
						.execute();
				return h.createUpdate("INSERT INTO \"RESIDENT\"( type, person_natural_fk) VALUES (:type, :person_natural_fk)")
					.bind("type", model.getName())
					.bind("person_natural_fk", identification)
					.executeAndReturnGeneratedKeys()
					.mapToBean(Resident.class)
					.findOnly();
			});
		}
		return null;
	}


	public Resident get(String key) {
		Resident resident = null;
		
		try(Handle handle = jdbi.open()) {
			handle.useTransaction(h -> {
				
			});
		}
		
		return resident;
	}

	public Pet addHimPet(Pet pet, String identification) {
		Pet petSaved = null;
		
		try(Handle handle = jdbi.open()){
			petSaved = handle.createUpdate("INSERT INTO public.\"PET\"(name, species, resident_fk) VALUES (:name, :species, :resident_fk)")
					.bind("name", pet.getName())
					.bind("species", pet.getSpecies())
					.bind("resident_fk", identification)
					.executeAndReturnGeneratedKeys()
					.mapToBean(Pet.class)
					.findOnly();
		}
		return petSaved;
	}
}
