package com.RezaAk.meritAmerica.Pokemon;

//this class is extended of the abstract class



public class Pokedex extends AbstractPokemon{
	Pokemon names = new Pokemon();
	public int myPokemons;

	
	
	// implement the listPokemon
	public void listPokemon() {
		this.myPokemons = Pokemon.count;
		System.out.println("Number of Pokemon in the Pokedex: " + myPokemons);
		
	}

	

}