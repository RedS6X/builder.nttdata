package com.design_patron.builder;

import lombok.Builder;

@Builder
public class Decorator implements IPerson{
	
	
	private Person person;
	
	public void setPerson(Person persona) {
		this.person = persona;
		
	}

	public String getName() {

		return person.getName() + "Decoracion nombre";
	}

	public int getAge(int edad) {

		return person.getAge()*200;
	}

	@Override
	public IPerson clonar() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
