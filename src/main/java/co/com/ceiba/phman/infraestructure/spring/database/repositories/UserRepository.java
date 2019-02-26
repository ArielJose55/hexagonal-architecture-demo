package co.com.ceiba.phman.infraestructure.spring.database.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.ceiba.phman.infraestructure.spring.database.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
}
