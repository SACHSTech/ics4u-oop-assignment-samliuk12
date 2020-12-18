package PokemonSimulation;

import java.util.*;

public class Trainer extends Person {

  private int badges;
  private int pokeballs;
  private int gymsVisited;

  public Trainer(String name, int age, Pokemon activePokemon) {
    super(name, age, activePokemon);
    this.badges = 0;
    this.pokeballs = 0;
    this.gymsVisited = 0;
  }

  public String toString() {
    String string = super.toString();
    string += "\nBadges: " + badges + "\nPokeballs: " + pokeballs + "\nGyms visited: " + gymsVisited;
    return string;
  }

  public int getBadges() {
    return badges;
  }

  public int getPokeballs() {
    return pokeballs;
  }

  public void addBadge() {
    badges++;
  }

  public void addPokeballs(int amount) {
    pokeballs += amount;
  }

  public int getGymsVisited() {
    return gymsVisited;
  }

  public void nextGym() {
    gymsVisited++;
  }

  public void catchPokemon(Pokemon newPokemon) {
    if (pokeballs <= 0) {
      System.out.println("You have no pokeballs!");
    }
    else {
      getPokemon().add(newPokemon);
      pokeballs--;
    }
  }

}