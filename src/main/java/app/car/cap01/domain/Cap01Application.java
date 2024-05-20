package app.car.cap01.domain;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EntityScan(basePackages = {"app.car.cap01.domain"})
@ComponentScan(basePackages = {"app.car.cap01.interfaces","app.car.cap01.domain"})
@SpringBootApplication
public class Cap01Application {

	public static void main(String[] args) {
		SpringApplication.run(Cap01Application.class, args);
	}

}
