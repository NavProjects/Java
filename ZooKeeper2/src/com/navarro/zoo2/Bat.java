package com.navarro.zoo2;

public class Bat extends Mammal {
	//constructor
	public Bat() {
		this.setEnergyLevel(300);
	}
	public Bat(int enrg) {
		this.setEnergyLevel(enrg);
	}
	
	
	//methods
	public void fly() {
			this.setEnergyLevel(this.getEnergyLevel() - 50);
			this.displayEnergy();
	}
	public void fly(int times) {
		this.setEnergyLevel(this.getEnergyLevel() - 50 * times);
		this.displayEnergy();
	}
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel() + 25);
		this.displayEnergy();
	}
	public void eatHumans(int times) {
		this.setEnergyLevel(this.getEnergyLevel() + 25 * times);
		this.displayEnergy();
	}
	public void attackTown() {
		this.setEnergyLevel(getEnergyLevel() - 100);
		this.displayEnergy();
	}
	public void attackTown(int times) {
		this.setEnergyLevel(getEnergyLevel() - 100 * times);
		this.displayEnergy();
	}

}
