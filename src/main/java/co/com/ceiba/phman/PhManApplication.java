package co.com.ceiba.phman;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.internal.util.Contracts;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.com.ceiba.phman.domain.models.Person;
import co.com.ceiba.phman.domain.models.User;

@SpringBootApplication
public class PhManApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhManApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			User person = new User();
			person.setUsername("5ssdd");
			person.setPassword("ded");
			
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<Person>> violations = validator.validate(person);
			System.out.println(violations);
		};
		
		
	}
}

