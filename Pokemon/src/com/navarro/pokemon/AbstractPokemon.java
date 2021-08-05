package com.navarro.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pok = new Pokemon(name, type, health);
		Pokedex.myPokemon.add(pok);
		return pok;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		String info = pokemon.getName() + pokemon.getHealth() + pokemon.getType();
		return info;
	}


}
