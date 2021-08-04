package com.navarro.pokemon;

public class Pokemon {
	//member variables
	private String name;
	private int health;
	private String type;
	//constructor
	private static int pokeCount = 0;
	public Pokemon(String name, String type, int health) {
		this.setName(name);
		this.setType(type);
		this.setHealth(health);
		pokeCount += 1;
	}
	//methods
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
		System.out.println(this.getName() + " attacked " + pokemon.getName());
		
	}
	//getters setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getPokeCount() {
		return pokeCount;
	}
	public static void setPokeCount(int pokeCount) {
		Pokemon.pokeCount = pokeCount;
	}
	
	
	
}
