package com.navarro.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	public ArrayList<Pokemon> myPokemon = new ArrayList<Pokemon>();
	
	public void catchem(String name,int health, String type) {
		Pokemon pokemo = this.createPokemon(name, health, type);
		myPokemon.add(pokemo);
	}


	@Override
	public void listPokemon() {
		for(Pokemon pokemo :myPokemon) {
			System.out.println(pokemo.getName());
		}
	}

}
