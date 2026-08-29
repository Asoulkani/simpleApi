package ma.aso.simpleapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SimpleApiApplication {
	private static final Logger log = LoggerFactory.getLogger(SimpleApiApplication.class);
	@Value("${allowedOrigins}")
	private String allowedOrigins;

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {

		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				log.info("Adding CORS mappings : " + allowedOrigins);
				registry.addMapping("/api/**").allowedOrigins(allowedOrigins);
				registry.addMapping("Canteen/api/**").allowedOrigins(allowedOrigins);
			}
		};
	}

}
