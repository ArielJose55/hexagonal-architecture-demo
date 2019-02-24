package co.com.ceiba.phman.infraestructure.spring.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="PERSONS")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonEntity {

	@Id
	@Column(name = "IDENTIFICATION", nullable = false)
	private String identification;
	
	@Column(name = "TYPE_IDENTIFICATION", nullable = false)
	private String typeIdentification;
}
