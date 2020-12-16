package PokemonSimulation;

public class Pokemon {

  // Instance variables
  private String name;
  private String type;
  private int maxHealth;
  private int health;
  private int evolution;
  private double xp;

  // Class variables
  private static double evolutionXP = 1000;

  public Pokemon(String name, String type, int maxHealth) {
    this.name = name;
    this.type = type;
    this.maxHealth = maxHealth;
    this.health = maxHealth;
    this.evolution = 1;
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

  public int getHealth() {
    return health;
  }

  public double getXP() {
    return xp;
  }

  public void regenerateHealth(int amount) {
    health += amount;
    if (health > maxHealth) health = maxHealth;
  }

  public void takeDamage(int amount) {
    health -= amount;
    if (health < 0) health = 0;
  }

  public void gainXP(double amount) {
    xp += amount;
    if (xp >= evolutionXP) {
      xp = 0;
      evolution++;
    }
  }

  public void attack(String ability) {
    System.out.println(name + " uses " + ability);
  }

}