package com.navarro.pokemon;

public class Test {

	public static void main(String[] args) {
		Pokedex yeet = new Pokedex();
		yeet.catchem("Charmander", 23, "Fire");
		Pokemon squirtle = yeet.catchem("Squirtle",20, "Water");
		Pokemon charmander = new Pokemon("Charmander", "Fire", 32);
		squirtle.attackPokemon(charmander);
		yeet.listPokemon();
	}

}
