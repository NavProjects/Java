package com.navarro.objectmaster;

public class Samurai extends Human {

	//constructor
	private static int numberOfSamurai = 0;
	public Samurai() {
		this.setHealth(200);
		numberOfSamurai ++;
	}
	//methods
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth((int)getHealth()/2);
		System.out.println(target.getClass().getSimpleName() + " died by " + this.getClass().getSimpleName());
		System.out.println(this.getClass().getSimpleName() + this.getHealth());
	}
	public void meditate() {
		this.setHealth((int)this.getHealth() * (this.getHealth()/2));
		System.out.println(this.getClass().getSimpleName()+ " " + this.getHealth());
	}
	public static void howMany() {
		System.out.println(numberOfSamurai);
	}

}
