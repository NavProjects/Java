package com.navarro.zoo1;

public class Gorrilla extends Mammal {
	//constructor
	public Gorrilla() {
	}
	public Gorrilla(int num) {
		this.setEnergyLevel(num);
	}
	
	//methods
	public void throwSomething() {
			this.setEnergyLevel(this.getEnergyLevel() - 5);
			this.displayEnergy();
	}
	public void throwSomething(int times) {
		this.setEnergyLevel(this.getEnergyLevel() - 5 * times);
		this.displayEnergy();
	}
	
	public void eatBananas() {
			this.setEnergyLevel(this.getEnergyLevel() + 10);
			this.displayEnergy();
		}
	public void eatBananas(int times) {
		this.setEnergyLevel(this.getEnergyLevel() + 10 * times);
		this.displayEnergy();
	}
	
	public void climb() {
		this.setEnergyLevel(getEnergyLevel() - 10);
		this.displayEnergy();
	}
	public void climb(int times) {
		this.setEnergyLevel(getEnergyLevel() - 10 * times);
		this.displayEnergy();
	}
	
	
	
}
