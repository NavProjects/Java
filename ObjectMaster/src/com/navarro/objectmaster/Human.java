package com.navarro.objectmaster;

public class Human {
	//member variables
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	//constructor
//	public Human() {
//	}
	//methods
	public void attack(Human human) {
		human.setHealth(human.getHealth() - this.getStrength());
		System.out.println(human.getHealth());
	}
	public String displayHealth() {
		return "Health: " + this.getHealth();
	}
	public String displayAll() {
		return "Strength: " + this.getStrength() + "\nStealth: " + this.getStealth() + "\nIntelligence: " + this.getIntelligence() + "\nHealth: " + this.getHealth();
	}
	//
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
