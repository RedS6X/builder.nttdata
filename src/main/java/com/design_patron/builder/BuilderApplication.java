package com.design_patron.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class BuilderApplication implements CommandLineRunner{
	
	@Autowired	
	private ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
		

	}

	@Override
	public void run(String... args) throws Exception {
		
		context.getBean("personaPrototype");
		
		Decorator decorador = new Decorator();
		Decorator decorador1 = new Decorator();
		
		decorador.setPerson(new Person("Uno",22));
		decorador1.setPerson(new Person("Dos",33));
		
		System.out.println("Decorator 0 > " + decorador);
		System.out.println("Decorator 1 > " + decorador1);
		
		Person persona = Person.builder().age(27).name("pepe").build();
		
		System.out.println(persona);
		
		System.out.println(context.getBean("personaPrototype").hashCode());
		System.out.println(context.getBean("personaPrototype").hashCode());
		System.out.println(context.getBean("personaPrototype").hashCode());
		System.out.println(context.getBean("personaPrototype").hashCode());
		System.out.println(context.getBean("personaPrototype").hashCode());
		
		System.out.println(context.getBean("personaSingleton").hashCode());
		System.out.println(context.getBean("personaSingleton").hashCode());
		System.out.println(context.getBean("personaSingleton").hashCode());
		
	}

}
