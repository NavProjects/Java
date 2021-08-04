package com.brayan.hello;

public class Creature {
	//member variables
	public String name;
	//constructor
	public Creature(String name) {
		this.name = name;
	}
	
	//methods
	public void sayName() {
		System.out.println("My name is " + this.name);
	}
	
	// getter - setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
