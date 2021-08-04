package com.navarro.objectmaster;

public class Ninja extends Human {

	//constructor
	public Ninja() {
		this.setStealth(10);
	}
	//methods
	public void steal(Human target) {
		target.setHealth(target.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
		System.out.println(target.getClass().getSimpleName() + " health decreased by " + target.getHealth() + "\n" + this.getClass().getSimpleName() +" health increases " + this.getHealth());
	}
	public void runAway() {
		this.setHealth(getHealth()-10);
		System.out.println(this.getClass().getSimpleName() +" health decreased by 10");
	}

}
