package co.com.ceiba.phman.infraestructure.spring.database.mappers;


import java.util.Optional;

import org.modelmapper.ModelMapper;

import co.com.ceiba.phman.domain.models.Model;
import co.com.ceiba.phman.infraestructure.spring.database.entities.Entity;

public final class Mapper <T extends Entity, M extends Model> {
	
	public T toEntity(M model, Class<? extends T> clss) {
		return new ModelMapper().map(model, clss);
	}
	
	public Optional<M>toModel(T entity, Class<? extends M> clss) {
		return Optional.ofNullable( new ModelMapper().map(entity, clss) );
	}
}
