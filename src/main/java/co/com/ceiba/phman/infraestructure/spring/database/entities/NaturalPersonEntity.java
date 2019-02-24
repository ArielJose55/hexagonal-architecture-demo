package co.com.ceiba.phman.infraestructure.spring.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NATURAL_PERSONS")
@Inheritance(strategy = InheritanceType.JOINED)
public class NaturalPersonEntity extends PersonEntity {

	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
}
