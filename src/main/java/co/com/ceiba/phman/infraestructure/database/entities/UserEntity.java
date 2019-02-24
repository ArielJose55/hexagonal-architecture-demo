package co.com.ceiba.phman.infraestructure.database.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "USERS")
public class UserEntity extends NaturalPersonEntity{

	@Column(name = "USERNAME", nullable = false, unique = true)
	private String userName;
	
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "REGISTER_DATE", nullable = false)
	private LocalDateTime registerDate;
	
	@Column(name = "DEPARTURE_DATE")
	private LocalDateTime departureDate;
}
