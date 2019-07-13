package com.RezaAk.meritAmerica.Pokemon;


//this abstract class is implement the interface class
//this class implement the createPokemon and pokemonInfo method in the interface class


//implement the createPokemon method
public abstract class AbstractPokemon implements PokemonInterface{
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	
	
	//implement the pokemonInfo method
	//we use getters here 
	 public void pokemonInfo(Pokemon pokemon){
	        System.out.println("********Pokemon Summary Report********"+
	        "\nPokemon Name: "+pokemon.getName()+
	        "\nPokemon Health: "+pokemon.getHealth()+
	        "\nPokemon Type: "+pokemon.getType()+
	        "\n");
	    }
}