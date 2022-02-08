package com.design_patron.builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
		
	
		//Creamos un BEAN que devuelve una persona
		@Bean(name = "personaPrototype")
		@Scope("prototype")
		public Person personaPrototype() {
			return new Person("Juan", 45);
		}

		@Bean(name = "personaSingleton")
		@Scope("singleton")
		public Person personaSingleton() {
			return new Person("Pepe", 46);
		}

}
