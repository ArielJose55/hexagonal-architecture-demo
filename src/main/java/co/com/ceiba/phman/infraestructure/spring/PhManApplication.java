package co.com.ceiba.phman.infraestructure.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PhManApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhManApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner run() {
//		return args -> {
//			User person = new User();
//			person.setUsername("5ssdd");
//			person.setPassword("ded");
//			
//			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//			Validator validator = factory.getValidator();
//			Set<ConstraintViolation<Person>> violations = validator.validate(person);
//			System.out.println(violations);
//		};
//		
//		
//	}
}

