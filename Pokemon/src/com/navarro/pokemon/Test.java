package com.navarro.pokemon;

public class Test {

	public static void main(String[] args) {
		Pokedex yeet = new Pokedex();
		yeet.catchem("Charmander", 23, "Fire");
		Pokemon squirtle = yeet.createPokemon("Squirtle",20, "Water");
		Pokemon charmander = yeet.createPokemon("Yeetus", 32, "Fire");
		squirtle.attackPokemon(charmander);
		yeet.listPokemon();
	}

}
