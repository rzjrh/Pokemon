package com.RezaAk.meritAmerica.Pokemon;

public class Pokemon {

	
	
	//declare the member variables 
	public String name;
	public  int health;
    public String type;
    public static int count;
	
	
    
    
    
   

    
    //getters
    public String getName() {
		return name;
	}
    public int getHealth() {
		return health;
	}
    public String getType() {
		return type;
	}
    public static int getCount() {
		return count;
	}
    
    
    
    
    //setters 
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(int health) {
		this.health =+ health;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static void setCount(int count) {
		Pokemon.count = count;
	}
    
	
	
	
	
	
	//the constructor
   public Pokemon(String name, int health, String type) {
		count++;
		setName(name);
		setType(type);
		setHealth(health);
	}
   
   
   
   
   //This method lowers the attacked Pokemon's health by 10
   
   public void attackPokemon ( Pokemon pokemon) {
	   pokemon.health -= 10;
      }


public Pokemon() {
	
}

	
}
