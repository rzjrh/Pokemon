package com.RezaAk.meritAmerica.Pokemon;



//his method returns a String with the name, health, and type of the pokemon
public interface PokemonInterface{
	Pokemon createPokemon(String name, int health, String type);
	void pokemonInfo(Pokemon pokemon);
	
	
	
	//List all the Pokemon names that you have in your pokedex
	void listPokemon();
}
