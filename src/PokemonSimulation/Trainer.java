package PokemonSimulation;

import java.util.*;

public class Trainer extends Person {

  // Instance variables
  private int badges;
  private int pokeballs;
  private int gymsVisited;

  /**
  * Constructor - creates a new Trainer instance
  *
  * @param name - the name of the trainer, passed into super constructor
  * @param age - the age of the trainer, passed into super constructor
  * @param activePokemon - the trainer's active Pokemon, passed into super constructor
  */
  public Trainer(String name, int age, Pokemon activePokemon) {
    super(name, age, activePokemon);
    this.badges = 0;
    this.pokeballs = 0;
    this.gymsVisited = 0;
  }

  /**
  * String representation of a trainer 
  *
  * @return badges, pokeballs, and gyms visited
  */
  public String toString() {
    String trainerString = super.toString();
    trainerString += "\nBadges: " + badges + "\nPokeballs: " + pokeballs + "\nGyms visited: " + gymsVisited;
    return trainerString;
  }

  /**
  * Getter method for badges 
  *
  * @return the number of badges the trainer has
  */
  public int getBadges() {
    return badges;
  }

  /**
  * Getter method for pokeballs
  *
  * @return the number of pokeballs the trainer has
  */
  public int getPokeballs() {
    return pokeballs;
  }

  /**
  * Getter method for gymsVisited
  *
  * @return the number of gyms the trainer has visited
  */
  public int getGymsVisited() {
    return gymsVisited;
  }

  /**
  * Increments the number of badges
  */
  public void addBadge() {
    badges++;
  }

  /**
  * Increments the number of pokeballs
  *
  * @param amount - the number of pokeballs the trainer gains
  */
  public void addPokeballs(int amount) {
    pokeballs += amount;
  }

  /**
  * Increments the number of visited gyms
  */
  public void nextGym() {
    gymsVisited++;
  }

  /**
  * Catches a new Pokemon 
  *
  * @param newPokemon - the Pokemon that is caught
  */
  public void catchPokemon(Pokemon newPokemon) {
    // Only catches the Pokemon if the trainer has pokeballs to use
    if (pokeballs <= 0) {
      System.out.println("You have no pokeballs!");
    }
    else {
      getPokemonList().add(newPokemon);
      pokeballs--;
    }
  }

}