package PokemonSimulation;

import java.util.*;

public class Person {

  // Instance variables
  private String name;
  private int age;
  private ArrayList<Pokemon> pokemonList;
  private Pokemon activePokemon;

  /**
  * Constructor - creates a new Person instance
  *
  * @param name - the person's full name
  * @param age - the person's age
  * @param activePokemon - the person's active Pokemon
  */
  public Person(String name, int age, Pokemon activePokemon) {
    this.name = name;
    this.age = age;
    this.activePokemon = activePokemon;
    this.pokemonList = new ArrayList<Pokemon>();
    this.pokemonList.add(activePokemon);
  }

  /**
  * String reprensentation of a person
  *
  * @return name, age, list of Pokemon, and active Pokemon
  */
  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nPokemon: " + pokemonToString() + "\nActive pokemon: " + activePokemon.getName();
  }

  /**
  * Private helper method that converts a list of the person's Pokemon into a string 
  *
  * @return a list of the person's Pokemon 
  */
  private String pokemonToString() {
    // Declare and initialize variables
    String theList;
    theList = "";

    // Iterate through each Pokemon in the person's list
    for (Pokemon currentPokemon: pokemonList) {
      theList += currentPokemon.getName() + ", ";
    }

    // Remove the additional comma and space at the end of the string
    return theList.substring(0, theList.length() - 2);
  }

  /**
  * Getter method for name
  *
  * @return the person's name
  */
  public String getName() {
    return name;
  }

  /**
  * Getter method for age
  *
  * @return the person's age
  */
  public int getAge() {
    return age;
  }

  /**
  * Getter method for pokemonList
  *
  * @return the person's list of pokemon
  */
  public ArrayList<Pokemon> getPokemonList() {
    return pokemonList;
  }

  /**
  * Getter method for activePokemon
  *
  * @return the person's active Pokemon
  */
  public Pokemon getActivePokemon() {
    return activePokemon;
  }

  /**
  * Setter method for pokemonList
  *
  * @param thePokemon - new active Pokemon
  * @return if thePokemon was set as the activePokemon
  */
  public boolean setActivePokemon(String thePokemon) {
    // Iterate through each Pokemon in the user's list of Pokemon, looking for a match
    for (Pokemon currentPokemon: pokemonList) {
      if (thePokemon.toLowerCase().equals(currentPokemon.getName().toLowerCase())) {
        activePokemon = currentPokemon;
        return true;
      }
    }
    return false;
  }

}