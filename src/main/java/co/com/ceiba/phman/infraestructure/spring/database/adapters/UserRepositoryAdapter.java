package co.com.ceiba.phman.infraestructure.spring.database.adapters;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import co.com.ceiba.phman.domain.models.User;
import co.com.ceiba.phman.domain.services.user.IUserRepository;
import co.com.ceiba.phman.infraestructure.spring.database.entities.UserEntity;
import co.com.ceiba.phman.infraestructure.spring.database.mappers.Mapper;
import co.com.ceiba.phman.infraestructure.spring.database.repositories.UserRepository;


public class UserRepositoryAdapter implements IUserRepository{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Optional<User> save(User user) {
		
		Mapper<UserEntity, User> mapperUser = new Mapper<>();
		
		return mapperUser.toModel(
				userRepository.save(
						mapperUser.toEntity(user, UserEntity.class)), User.class);
	}
	
}
