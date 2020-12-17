package PokemonSimulation;

public class Pokemon {

  // Instance variables
  private String name;
  private String type;
  private String ability;
  private int abilityDamage;
  private int maxHealth;
  private int health;
  private int evolution;
  private double xp;

  // Class variables
  private static double evolutionXP = 1000;

  public Pokemon(String name, String type, String ability, int abilityDamage, int maxHealth) {
    this.name = name;
    this.type = type;
    this.ability = ability;
    this.abilityDamage = abilityDamage;
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
    if (xp >= evolutionXP) {
      xp = 0;
      evolution++;
    }
  }

  public void attack() {
    System.out.println(name + " uses " + ability + ", dealing " + abilityDamage + " damage.");
  }

}