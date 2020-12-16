package PokemonSimulation;

public class PokemonSimulator {

  public static void main(String args[]) {

    Pokemon pika = new Pokemon("Pikachu", "Lightning", 500);
    System.out.println(pika);
    pika.attack("Lightning bolt");
    pika.takeDamage(300);
    System.out.println(pika.getHealth());

  }

}