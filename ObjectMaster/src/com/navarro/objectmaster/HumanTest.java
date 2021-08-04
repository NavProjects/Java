package com.navarro.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		
//		Human mans1 = new Human();
//		Human mans2 = new Human();
//		System.out.println(mans1.displayAll());
//		System.out.println(mans1.displayHealth());
//		mans1.attack(mans2);
		Wizard wiz1 = new Wizard();
		Wizard wiz2 = new Wizard();
		Ninja ninja1 = new Ninja();
		Samurai sam1 = new Samurai();
		Samurai sam2 = new Samurai();
		sam1.deathBlow(sam2);
		wiz1.heal(wiz2);
		wiz2.fireball(ninja1);
		ninja1.steal(wiz2);
		Samurai.howMany();
	}

}
