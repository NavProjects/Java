package com.navarro.objectmaster;

public class Wizard extends Human {
	//constructor
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	//methods
	public void heal(Human target) {
		target.setHealth(target.getHealth()+this.getIntelligence());
		System.out.println(target.getClass().getSimpleName() + " health increased to " + target.getHealth());
	}
	public void fireball(Human target) {
		target.setHealth(target.getHealth()-this.getIntelligence()*3);
		System.out.println(target.getClass().getSimpleName() + " health decreased to " + target.getHealth());
	}
	

}
