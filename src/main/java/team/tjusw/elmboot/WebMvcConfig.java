package team.tjusw.elmboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:8081").allowCredentials(true)
						.allowedHeaders("Content-Type")
						.exposedHeaders()
						.allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH")
						.maxAge(1800);
			}
		};

	}

}
