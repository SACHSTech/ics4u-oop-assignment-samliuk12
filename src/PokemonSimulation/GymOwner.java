package PokemonSimulation;

public class GymOwner extends Person {
  
  // Instance variables
  private int victories;
  private int defeats;
  private GymLocation gymLocation;
  
  /**
  * Constructor - creates a new GymOwner instance
  *
  * @param name - the name of the gym owner, passed into super constructor
  * @param age - the age of the gym owner, passed into super constructor
  * @param activePokemon - the gym owner's active Pokemon, passed into super constructor
  * @param gymLocation - the location of the gym owner's gym
  */
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
