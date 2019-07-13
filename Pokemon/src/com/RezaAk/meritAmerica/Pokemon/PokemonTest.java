package com.RezaAk.meritAmerica.Pokemon;

public class PokemonTest{
    public static void main(String[] args){
    	
    	
    //use objects of attack and Pokedex
      Pokedex pokedex = new Pokedex();
      Pokemon attack = new Pokemon();
      
      
      
   // here is some of the pokemon names: pikachu, mewtwo, ditto, gengar
      Pokemon mewtwo = pokedex.createPokemon("Mewtwo", 85, "Shadow_Ball");
      Pokemon pikachu = pokedex.createPokemon("Pikachu", 55, "Shock");
      Pokemon ditto = pokedex.createPokemon("Ditto", 35, "Shape_Change");
      Pokemon gengar = pokedex.createPokemon("Gengar", 40, "Ghost");

      
      
      
      
      pokedex.pokemonInfo(mewtwo);
      pokedex.pokemonInfo(pikachu);
      pokedex.pokemonInfo(ditto);
      pokedex.pokemonInfo(gengar);
      
      
      attack.attackPokemon(ditto);
      attack.attackPokemon(gengar);
      
      pokedex.pokemonInfo(ditto);
      pokedex.pokemonInfo(gengar);
      
      pokedex.listPokemon();

   
    }
}