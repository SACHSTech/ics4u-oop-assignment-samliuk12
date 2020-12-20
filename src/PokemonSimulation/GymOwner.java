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

  /**
  * String representation of a gym owner
  *
  * @return a description including all the characteristics of a Person, the number of victories, the number of defeats, and the city of the gym
  */
  public String toString() {
    String string = super.toString();
    string += "\nVictories: " + victories + "\nDefeats: " + defeats + "\nGym location: " + gymLocation.getCity();
    return string;
  }

  /**
  * Getter method for victories
  *
  * @return the number of victories
  */
  public int getVictories() {
    return victories;
  }

  /**
  * Getter method for defeats
  *
  * @return the number of defeats
  */
  public int getDefeats() {
    return defeats;
  }

  /**
  * Increments the number of victories
  */
  public void addVictory() {
    victories++;
  }

  /**
  * Increments the number of defeats
  */
  public void addDefeat() {
    defeats++;
  }

  /**
  * Getter method for the gym location
  *
  * @return the gym location
  */
  public GymLocation getGymLocation() {
    return gymLocation;
  }

}
