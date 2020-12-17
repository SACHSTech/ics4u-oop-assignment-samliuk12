package PokemonSimulation;

import java.io.*;
import java.util.*;

public class PokemonSimulator {

  /**
  * Displays my logo
  *
  * @return void
  */
  public static void displayLogo() {

    System.out.println("\n    G A E T           P O\n  U Q P F G L         I N\nO R         F N       F C\nI Y L                 T U\nU P                   I L\nM L I                 R Z\n  K Q V               Q E\n      U T K           Y Q\n        B C P         P L\n          L U T       H J\n            R V Z     T V\n              P I     O P\n              O Q     E W\n V            Q N     N L\nW Y         A S       I Q\n  T R R P L I         S T L P Q U V R T K\n    L Q R T           B H V K A S L A J O\n"); 

    // Pause two three seconds before starting the game
    pause(2000);

  }

  /**
  * Pauses the program
  *
  * @param pauseLength The pause length 
  * @return void
  */
  private static void pause(int pauseLength) {
    try {
        Thread.sleep(pauseLength);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }

  /**
  * Creates new line
  *
  * @return void
  */
  public static void newLine() {
    System.out.println();
  }

  /**
  * Simulates the battle between two Pokemon, returning the winner
  *
  * @param pokemon1 The first Pokemon
  * @param pokemon2 The second Pokemon
  * @return The winner
  */
  public static Pokemon simulateBattle(Pokemon pokemon1, Pokemon pokemon2) {

    // The Pokemon take turns attacking until one of them runs out of health
    while (true) {
      pokemon1.attack();
      pokemon2.takeDamage(pokemon1.getAbilityDamage());
      System.out.println(pokemon2.getName() + " has " + pokemon2.getHealth() + " health left.");
      // Check if Pokemon 2 has no health
      if (pokemon2.getHealth() == 0) {
        return pokemon1;
      }
      pause(2000);

      pokemon2.attack();
      pokemon1.takeDamage(pokemon2.getAbilityDamage());
      System.out.println(pokemon1.getName() + " has " + pokemon1.getHealth() + " health left.");
      // Check if Pokemon 1 has no health
      if (pokemon1.getHealth() == 0) {
        return pokemon2;
      }
      pause(2000);
    }

  }

  public static void main(String args[]) throws IOException {

    // Initialize buffered reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Declare variables
    Trainer user;
    String userName;
    int userAge;
    Pokemon userPokemon;
    String pokemonName;

    // Initialize variables
    pokemonName = "";

    // Introduction to game
    // displayLogo();

    // Get player name
    System.out.print("Welcome to the magical world of Pokemon. What should I call you? ");
    userName = keyboard.readLine();
    newLine();

    // Get player age
    System.out.print("Hi " + userName + "! How old are you? ");
    userAge = Integer.parseInt(keyboard.readLine());
    newLine();

    // Get player starting Pokemon
    System.out.println("Great! Now it's time to choose your first Pokemon. Type out your full choice! \na) Charmander\nb) Squirtle\nc) Bulbasaur");
    pokemonName = keyboard.readLine().toLowerCase();
    while (!pokemonName.equals("charmander") && !pokemonName.equals("squirtle") && !pokemonName.equals("bulbasaur")) {
      System.out.println("Invalid option. Please try again.");
      newLine();
      pokemonName = keyboard.readLine().toLowerCase();
    }
    newLine();

    // Create trainer object
    System.out.println("Here's what we have for you so far...");
    if (pokemonName.equals("charmander")) {
      user = new Trainer(userName, userAge, new Pokemon("Charmander", "Fire", "Flamethrower", 200, 300));
    }
    else if (pokemonName.equals("squirtle")) {
      user = new Trainer(userName, userAge, new Pokemon("Squirtle", "Water", "Watergun", 300, 200));
    }
    else {
      user = new Trainer(userName, userAge, new Pokemon("Bulbasaur", "Grass", "Vine whip", 175, 350));
    }
    System.out.println(user);
    pause(5000);
    newLine();

    // Catch first Pokemon
    System.out.println("Let's go explore the world now! Oh look, a wild Horsea! Let's go catch it! Time to duel!");
    pause(3000);
    newLine();

    // Simulate fight with Horsea
    Pokemon Horsea = new Pokemon("Horsea", "Water", "Sniper", 150, 310);
    Pokemon winner = simulateBattle(user.getActivePokemon(), Horsea);
    newLine();

    // Catch Horsea
    System.out.print(winner.getName() + " has won!. Before you catch the Horsea, you need pokeballs. How many pokeballs do you want? ");
    user.addPokeballs(Integer.parseInt(keyboard.readLine()));
    
    newLine();
    System.out.println("Pokeballs have been successfully added! Horsea has been caught!");
    user.catchPokemon(Horsea);
    pause(2000);

    // Show updated user info
    newLine();
    System.out.println("Here, you can see your updated list of Pokemon!");
    System.out.println(user);
    pause(5000);
    newLine();

    // Regenerate Pokemon health
    System.out.println("Let's regenerate the health of our Pokemon!");
    for (int i = 0; i < 3; i++) {
      System.out.println("Regenerating...");
      pause(1000);
    }
    for (Pokemon currentPokemon: user.getPokemon()) {
      currentPokemon.regenerateHealth();
    }
    newLine();
    System.out.println("Pokemon have been regenerated! It's time to go to a Pokemon gym!");

    // Find gym
    for (int i = 0; i < 3; i++) {
      
    }

  }

}