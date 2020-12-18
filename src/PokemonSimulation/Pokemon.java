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

  public Pokemon(String name, String type, String ability, int abilityDamage, int maxHealth) {
    this.name = name;
    this.type = type;
    this.ability = ability;
    this.abilityDamage = abilityDamage;
    this.maxHealth = maxHealth;
    this.health = maxHealth;
    this.xp = 0.0;
  }

  public String toString() {
    return "Analyzing pokemon...\nName: " + name + "\nType: " + type + "\nHealth: " + health + "\nXP: " + xp + "\nYour pokemon looks healthy!";
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public int getAbilityDamage() {
    return abilityDamage;
  }

  public int getHealth() {
    return health;
  }

  public double getXP() {
    return xp;
  }

  public void regenerateHealth() {
    health = maxHealth;
  }

  public void takeDamage(int amount) {
    health -= amount;
    if (health < 0) health = 0;
  }

  public void gainXP(double amount) {
    xp += amount;
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

  public void attack() {
    System.out.println(name + " uses " + ability + ", dealing " + abilityDamage + " damage.");
  }

  /**
  * Simulates the battle between two Pokemon, returning the winner
  *
  * @param pokemon1 The first Pokemon
  * @param otherPokemon The second Pokemon
  * @return The winner
  */
  public Pokemon simulateBattle(Pokemon otherPokemon) {

    // The Pokemon take turns attacking until one of them runs out of health
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