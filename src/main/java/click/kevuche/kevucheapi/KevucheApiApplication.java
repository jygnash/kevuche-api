package click.kevuche.kevucheapi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.sql.DataSource;


@SpringBootApplication
@EnableGlobalMethodSecurity	
public class KevucheApiApplication {
	private static final Logger logger = LogManager.getLogger(KevucheApiApplication.class);

	public static void main(String[] args) {
		logger.info("Starting the kevuche.api");
		SpringApplication.run(KevucheApiApplication.class, args);
	}


	@Bean
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:postgresql://localhost:5432/mydb");
		dataSourceBuilder.username("postgres");
		dataSourceBuilder.password("postgres");
		return dataSourceBuilder.build();
	}



}
