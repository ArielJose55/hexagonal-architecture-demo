package co.com.ajac.database.config;


import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.postgres.PostgresPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

	@Bean
	public Jdbi dataSourcePostgres() {
		return Jdbi.create("jdbc:postgresql://localhost:5432/ph-man-database", "phman_user", "root")
				.installPlugin(new PostgresPlugin());
	}
}