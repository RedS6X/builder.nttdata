package com.design_patron.builder;

public class Person implements IPerson {
	
	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
		
	}
	
	public static class PersonBuilder {
		private String name;
		private int age;
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public Person build() {
			return new Person(this.name,this.age);
		}
	}
	
	public Person clonar() {
		
		return new Person(this.name,this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person1 nombre=" + name + " edad=" + age;
	}

}