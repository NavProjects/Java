package com.navarro.zoo1;

public class GorilllaTest {

	public static void main(String[] args) {
		Mammal myMammal = new Mammal();
		myMammal.displayEnergy();
		Gorrilla myGorrilla = new Gorrilla();
		myGorrilla.throwSomething(3);
		myGorrilla.eatBananas(2);
		myGorrilla.climb();
		Gorrilla kong = new Gorrilla(500);
		kong.displayEnergy();
		
	}

}
