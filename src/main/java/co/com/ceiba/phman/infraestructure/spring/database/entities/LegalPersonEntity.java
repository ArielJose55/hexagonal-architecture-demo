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
@Table(name="LEGAL_PERSONS")
@Inheritance(strategy = InheritanceType.JOINED)
public class LegalPersonEntity extends PersonEntity {

	@Column(name = "BUSINESS_NAME", nullable = false)
	private String businessName;
}
