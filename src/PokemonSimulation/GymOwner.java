package PokemonSimulation;

public class GymOwner extends Person {

  private int victories;
  private int defeats;
  private GymLocation gymLocation;

  public GymOwner(String name, int age, Pokemon activePokemon, GymLocation gymLocation) {
    super(name, age, activePokemon);
    victories = 0;
    defeats = 0;
    this.gymLocation = gymLocation;
  }

  public String toString() {
    String string = super.toString();
    string += "\nVictories: " + victories + "\nDefeats: " + defeats + "\nGym location: " + gymLocation.getCity();
    return string;
  }

  public int getVictories() {
    return victories;
  }

  public int getDefeats() {
    return defeats;
  }

  public void addVictory() {
    victories++;
  }

  public void addDefeat() {
    defeats++;
  }

  public GymLocation getGymLocation() {
    return gymLocation;
  }

}