package com.tech_turtles.tech_turtles;

import com.tech_turtles.tech_turtles.model.Employee;
import com.tech_turtles.tech_turtles.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechTurtlesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TechTurtlesApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee();
		employee1.setFirstName("Simran");
		employee1.setLastName("Singh");
		employee1.setEmailId("simran@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Nikhil");
		employee2.setLastName("Kumar");
		employee2.setEmailId("Nikhil@gmail.com");
		employeeRepository.save(employee2);

	}
}
