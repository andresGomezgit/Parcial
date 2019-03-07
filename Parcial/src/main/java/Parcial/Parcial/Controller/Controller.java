package Parcial.Parcial.Controller;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan (basePackages="Parcial.Parcial.Controller,Parcial.Parcial.Servicios,Parcial.Parcial.Repositories,Parcial.Parcial.entities")
@EntityScan(basePackages = {"Parcial.Parcial.entities"}) 
@EnableJpaRepositories ("Parcial.Parcial.Repositories")
public class Controller {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

}

