package co.com.ceiba.phman.infraestructure.database.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RESIDENTS")
public class ResidentEntity extends NaturalPersonEntity {
}
