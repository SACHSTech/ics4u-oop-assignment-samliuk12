package PokemonSimulation;

import java.util.*;

public class PokemonSimulator {

  public static void main(String args[]) {

    Trainer ash = new Trainer("Ash", 15, new Pokemon("pika", "lightning", 200));
    System.out.println(ash);
    ash.addPokeballs(30);
    ash.catchPokemon(new Pokemon("Charmander", "fire", 300));
    System.out.println(ash);
    ash.setActivePokemon(ash.getPokemon().get(1));
    System.out.println(ash);
  }

}