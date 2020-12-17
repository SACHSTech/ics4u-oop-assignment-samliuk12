package PokemonSimulation;

import java.util.*;

public class Person {

  private String name;
  private int age;
  private ArrayList<Pokemon> pokemon;
  private Pokemon activePokemon;

  public Person(String name, int age, Pokemon activePokemon) {
    this.name = name;
    this.age = age;
    this.activePokemon = activePokemon;
    this.pokemon = new ArrayList<Pokemon>();
    this.pokemon.add(activePokemon);
  }

  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nPokemon: " + pokemonToString() + "\nActive pokemon: " + activePokemon.getName();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public ArrayList<Pokemon> getPokemon() {
    return pokemon;
  }

  private String pokemonToString() {
    String theList;
    theList = "";

    for (Pokemon currentPokemon: pokemon) {
      theList += currentPokemon.getName() + ", ";
    }

    return theList.substring(0, theList.length() - 2);
  }

  public Pokemon getActivePokemon() {
    return activePokemon;
  }

  public void setActivePokemon(Pokemon thePokemon) {
    for (Pokemon currentPokemon: pokemon) {
      if (thePokemon == currentPokemon) {
        activePokemon = thePokemon;
        return;
      }
    }
  }

  public void activePokemonAttack(String ability) {
    activePokemon.attack(ability);
  }

  public void dance() {
    System.out.println(name + " is dancing woooo!");
  }

}