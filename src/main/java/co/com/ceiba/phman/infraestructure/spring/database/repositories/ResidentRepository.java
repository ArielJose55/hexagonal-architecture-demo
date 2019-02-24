package co.com.ceiba.phman.infraestructure.spring.database.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.ceiba.phman.infraestructure.spring.database.entities.ResidentEntity;

@Repository
public interface ResidentRepository extends CrudRepository<ResidentEntity, String>{

}
