package PokemonSimulation;

public class PokemonSimulator {

  public static void main(String args[]) {

    Pokemon pika = new Pokemon("Pikachu", "Lightning", 500);
    Person ash = new Person("Ash", 15, pika);
    System.out.println(ash);
    ash.dance();

  }

}