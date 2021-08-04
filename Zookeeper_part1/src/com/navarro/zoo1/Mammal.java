package com.navarro.zoo1;

public class Mammal {
	//member variables
	private int energyLevel;
	//constructor
	public Mammal() {
		this.energyLevel = 100;
	}
	//methods
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	// getter - setter
	public int getEnergyLevel() {
		return energyLevel;
	}
	public int setEnergyLevel(int energyLevel) {
		return this.energyLevel = energyLevel;
	}

}
