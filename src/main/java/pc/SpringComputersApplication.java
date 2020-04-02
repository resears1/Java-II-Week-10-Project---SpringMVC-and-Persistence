package pc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pc.beans.Components;
import pc.beans.Computer;
import pc.controller.BeanConfiguration;
import pc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
	}

}
