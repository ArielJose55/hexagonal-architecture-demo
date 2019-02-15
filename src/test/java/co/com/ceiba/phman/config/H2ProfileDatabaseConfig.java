package co.com.ceiba.phman.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class H2ProfileDatabaseConfig {
	
	@Bean
	@Profile("test")
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
		dataSource.setUsername("PhMan");
		dataSource.setPassword("phman");

		return dataSource;
	}

//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//		em.setDataSource(dataSource());
//		em.setPackagesToScan(new String[] { "co.com.ceiba.parkingchallenge.entities" });
//		em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//		em.setJpaProperties(additionalProperties());
//		return em;
//	}
//
//	@Bean
//	JpaTransactionManager transactionManager(final EntityManagerFactory entityManagerFactory) {
//		final JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(entityManagerFactory);
//		return transactionManager;
//	}
//
//	final Properties additionalProperties() {
//		final Properties hibernateProperties = new Properties();
//
//		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
//		hibernateProperties.setProperty("hibernate.show_sql", "true");
//
//		return hibernateProperties;
//	}
}
