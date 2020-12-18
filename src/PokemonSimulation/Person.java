package PokemonSimulation;

import java.util.*;

public class Person {

  private String name;
  private int age;
  private ArrayList<Pokemon> pokemonList;
  private Pokemon activePokemon;

  public Person(String name, int age, Pokemon activePokemon) {
    this.name = name;
    this.age = age;
    this.activePokemon = activePokemon;
    this.pokemonList = new ArrayList<Pokemon>();
    this.pokemonList.add(activePokemon);
  }

  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nPokemon: " + pokemonToString() + "\nActive pokemon: " + activePokemon.getName();
  }

  private String pokemonToString() {
    String theList;
    theList = "";

    for (Pokemon currentPokemon: pokemonList) {
      theList += currentPokemon.getName() + ", ";
    }

    return theList.substring(0, theList.length() - 2);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public ArrayList<Pokemon> getPokemonList() {
    return pokemonList;
  }

  public Pokemon getActivePokemon() {
    return activePokemon;
  }

  public boolean setActivePokemon(String thePokemon) {
    for (Pokemon currentPokemon: pokemonList) {
      if (thePokemon.toLowerCase().equals(currentPokemon.getName().toLowerCase())) {
        activePokemon = currentPokemon;
        return true;
      }
    }
    return false;
  }

}