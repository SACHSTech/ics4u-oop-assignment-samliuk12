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
    try {
        Thread.sleep(3000);
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
      user = new Trainer(userName, userAge, new Pokemon("Charmander", "Fire", 300));
    }
    else if (pokemonName.equals("squirtle")) {
      user = new Trainer(userName, userAge, new Pokemon("Squirtle", "Water", 200));
    }
    else {
      user = new Trainer(userName, userAge, new Pokemon("Bulbasaur", "Water", 350));
    }
    System.out.println(user);

    // Ask the user if they want to dance
    System.out.println("Do you want to do a quick celebratory dance?");
    if (keyboard.readLine().toLowerCase.equals("yes")) {
      user.dance();
    }
    else {
      System.out.println("Okay, no problem!");
    }
    newLine();

    

  }

}