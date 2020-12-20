package PokemonSimulation;

public class Pokemon {

  // Instance variables
  private String name;
  private String type;
  private String ability;
  private int abilityDamage;
  private int maxHealth;
  private int health;
  private double xp;

  /**
  * Constructor - creates a new Pokemon instance
  *
  * @param name - the Pokemon's name
  * @param type - the Pokemon's type 
  * @param ability - the Pokemon's ability 
  * @param abilityDamage - the damage dealt by the Pokemon's ability 
  * @param maxHealth - the maximum health of the Pokemon
  */
  public Pokemon(String name, String type, String ability, int abilityDamage, int maxHealth) {
    this.name = name;
    this.type = type;
    this.ability = ability;
    this.abilityDamage = abilityDamage;
    this.maxHealth = maxHealth;
    this.health = maxHealth;
    this.xp = 0.0;
  }

  /**
  * String representation of a Pokemon 
  *
  * @return name, type, health, and xp
  */
  public String toString() {
    return "Analyzing pokemon...\nName: " + name + "\nType: " + type + "\nHealth: " + health + "\nXP: " + xp;
  }

  /**
  * Getter method for name
  *
  * @return the Pokemon's name
  */
  public String getName() {
    return name;
  }

  /**
  * Getter method for type
  *
  * @return the Pokemon's type
  */
  public String getType() {
    return type;
  }

  /**
  * Getter method for ability damage
  *
  * @return the Pokemon's ability damage
  */
  public int getAbilityDamage() {
    return abilityDamage;
  }

  /**
  * Getter method for health
  *
  * @return the Pokemon's health
  */
  public int getHealth() {
    return health;
  }

  /**
  * Getter method for xp
  *
  * @return the Pokemon's xp
  */
  public double getXP() {
    return xp;
  }

  /**
  * Regenerates the health of the Pokemon to its maximum
  */
  public void regenerateHealth() {
    health = maxHealth;
  }

  /**
  * Causes the Pokemon to take damage 
  *
  * @param amount - the amount of damage taken by the Pokemon
  */
  public void takeDamage(int amount) {
    health -= amount;
    // Ensures the health is nonnegative
    if (health < 0) health = 0;
  }

  /**
  * Causes the Pokemon to gain xp 
  *
  * @param amount - the amount of xp the Pokemon gains
  */
  public void gainXP(double amount) {
    xp += amount;
  }

  /**
  * Pauses the program
  *
  * @param pauseLength - the pause length in milliseconds
  */
  private void pause(int pauseLength) {
    try {
        Thread.sleep(pauseLength);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }

  /**
  * Prints the Pokemon's name, ability, and ability damage, simulating an attack
  */
  public void attack() {
    System.out.println(name + " uses " + ability + ", dealing " + abilityDamage + " damage.");
  }

  /**
  * Simulates the battle between two Pokemon, returning the winner
  *
  * @param otherPokemon - the other Pokemon
  * @return the winner
  */
  public Pokemon simulateBattle(Pokemon otherPokemon) {

    // The Pokemon take turns attacking each other until one of them runs out of health
    while (true) {
      attack();
      otherPokemon.takeDamage(abilityDamage);
      System.out.println(otherPokemon.getName() + " has " + otherPokemon.getHealth() + " health left.");
      pause(3000);
      // Check if Pokemon 2 has no health
      if (otherPokemon.getHealth() == 0) {
        return this;
      }

      otherPokemon.attack();
      takeDamage(otherPokemon.getAbilityDamage());
      System.out.println(name + " has " + health + " health left.");
      pause(3000);
      // Check if Pokemon 1 has no health
      if (health == 0) {
        return otherPokemon;
      }
    }

  }

}