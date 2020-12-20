package PokemonSimulation;

import java.io.*;
import java.util.*;

public class PokemonSimulator {

  /**
  * Displays logo
  */
  public static void displayLogo() {

    System.out.println("\n    G A E T           P O\n  U Q P F G L         I N\nO R         F N       F C\nI Y L                 T U\nU P                   I L\nM L I                 R Z\n  K Q V               Q E\n      U T K           Y Q\n        B C P         P L\n          L U T       H J\n            R V Z     T V\n              P I     O P\n              O Q     E W\n V            Q N     N L\nW Y         A S       I Q\n  T R R P L I         S T L P Q U V R T K\n    L Q R T           B H V K A S L A J O\n\n"); 

    // Pause two seconds before starting the game
    pause(2000);

  }

  /**
  * Pauses the program
  *
  * @param pauseLength - the pause length 
  */
  private static void pause(int pauseLength) {
    try {
        Thread.sleep(pauseLength);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }

  /**
  * Prints blank line
  */
  public static void newLine() {
    System.out.println();
  }

  public static void main(String args[]) throws IOException {

    // Initialize buffered reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Declare variables
    Person sam;
    String userName;
    int userAge;
    String pokemonName;
    Trainer user;
    Pokemon horsea;
    Pokemon winner;
    GymLocation rockyMountains;
    GymOwner brock;
    String activePokemon;

    // Initialize variables
    pokemonName = "";

    // Display game logo
    displayLogo();

    // Make Sam 
    sam = new Person("Sam", age, new Pokemon("Infernape", "Fire", "Instakill", 999, 999));

    // Get player name
    System.out.print("Hi, I'm " + sam.getName() + "! Welcome to the magical world of Pokemonada. What should I call you? ");
    userName = keyboard.readLine();
    newLine();

    // Get player age
    System.out.print("Hi " + userName + "! How old are you? ");
    userAge = Integer.parseInt(keyboard.readLine());
    newLine();

    // Get player starting Pokemon
    System.out.println("Great! Now it's time to choose your first Pokemon. Type the corrresponding letter. \na) Charmander\nb) Squirtle\nc) Bulbasaur");
    pokemonName = keyboard.readLine().toLowerCase();
    while (!pokemonName.equals("a") && !pokemonName.equals("b") && !pokemonName.equals("c")) {
      System.out.println("Invalid option. Please try again.");
      pokemonName = keyboard.readLine().toLowerCase();
    }
    newLine();

    // Create trainer object depending on the user's Pokemon selection
    if (pokemonName.equals("a")) {
      user = new Trainer(userName, userAge, new Pokemon("Charmander", "Fire", "Flamethrower", 200, 300));
    }
    else if (pokemonName.equals("b")) {
      user = new Trainer(userName, userAge, new Pokemon("Squirtle", "Water", "Watergun", 300, 200));
    }
    else {
      user = new Trainer(userName, userAge, new Pokemon("Bulbasaur", "Grass", "Vine whip", 175, 350));
    }

    // Display user information
    System.out.println("Here's what we have for you so far...");
    System.out.println(user);
    pause(5000);
    newLine();

    // A wild Horsea has been found
    System.out.println("Oh look, a wild Horsea! Time to duel it!");
    pause(3000);
    newLine();

    // Simulate fight with Horsea
    horsea = new Pokemon("Horsea", "Water", "Sniper", 150, 310);
    winner = user.getActivePokemon().simulateBattle(horsea);
    newLine();

    // Catch Horsea
    System.out.print(winner.getName() + " has won! Before you catch the Horsea, you need pokeballs. How many pokeballs do you want? ");
    user.addPokeballs(Integer.parseInt(keyboard.readLine()));
    
    // Catch Horsea if the user has 1 or more pokeballs
    newLine();
    user.catchPokemon(horsea);
    if (user.getPokeballs() > 0) {
      System.out.println("Pokeballs have been successfully added! Horsea has been caught!");
    }
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
    for (Pokemon currentPokemon: user.getPokemonList()) {
      currentPokemon.regenerateHealth();
    }
    newLine();
    System.out.println("Pokemon have been regenerated! It's time to go to a Pokemon gym!");
    pause(3000);

    // Find gym
    for (int i = 0; i < 3; i++) {
      System.out.println("Finding...");
      pause(1000);
    }
    System.out.println("A gym has been found!");
    pause(2000);
    newLine();

    // Create gym owner and gym location object
    rockyMountains = new GymLocation("Brock", "Pokeville", "sunny", 110);
    brock = new GymOwner("Brock", 23, new Pokemon("Onix", "Rock", "Rock smash", 50, 600), rockyMountains);
    System.out.println(rockyMountains);
    pause(3000);
    newLine();

    // Talk with Brock
    System.out.println(brock.getName() + ": Hey there " + user.getName() + ". I heard you wanted to challenge me!");
    System.out.print("Type your response: ");
    System.out.println(user.getName() + ": " + keyboard.readLine());
    System.out.println(brock.getName() + ": Let's do this!");
    pause(2000);
    newLine();

    // Brock summons Onix
    System.out.println("Brock summons " + brock.getActivePokemon().getName() + "!");
    newLine();
    pause(1500);

    // Have user choose their Pokemon
    System.out.print("It's time to choose your Pokemon! ");
    activePokemon = keyboard.readLine();
    while (!user.setActivePokemon(activePokemon)) {
      System.out.println("Invalid option. Please try again! ");
      activePokemon = keyboard.readLine();
    }
    newLine();

    // Have user select active Pokemon
    System.out.println("Pokemon has been selected! You chose: " + user.getActivePokemon().getName());
    pause(1500);
    System.out.println("Let the battle begin!");
    newLine();
    pause(2000);

    // Simulate battle
    winner = user.getActivePokemon().simulateBattle(brock.getActivePokemon());
    System.out.println(winner.getName() + " is the winner!");
    pause(2000);
    newLine();

    // If the user's Pokemon won
    if (winner == user.getActivePokemon()) {
      System.out.println("Brock: Wow, I can't believe you won! Well done! Here is your rock badge for beating me!");
      user.getActivePokemon().gainXP(100);
      brock.getActivePokemon().gainXP(50);
      brock.addDefeat();
      user.addBadge();
    }
    // If Brock won
    else {
      System.out.println("Brock: That was a close one! Not bad for your first gym!");
      user.getActivePokemon().gainXP(50);
      brock.getActivePokemon().gainXP(100);
      brock.addVictory();
    }

    // Update variables
    user.nextGym();

    // Interact with user
    System.out.print("Type your response: ");
    System.out.println(user.getName() + ": " + keyboard.readLine());

    // Conclusion
    newLine();
    System.out.println("Well that's all I have for you today. Time to go back to your world! Thanks for playing!");

  }

}