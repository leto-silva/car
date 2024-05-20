package app.car.cap01.infraestructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan(basePackages = {"app.car.cap01.domain", "app.car.cap01.interfaces"})
@SpringBootApplication
public class Cap01Application {

	public static void main(String[] args) {
		SpringApplication.run(Cap01Application.class, args);
	}

}
