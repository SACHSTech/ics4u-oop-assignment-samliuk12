package PokemonSimulation;

public class GymLocation {

  // Instance variables
  private String owner;
  private String city;
  private String weather;
  private int population;

  /**
  * Constructor - creates a new GymLocation instance
  *
  * @param owner - the gym owner's full name
  * @param city - the city the gym is located in
  * @param weather - the weather of the city
  * @param population - the population of the city
  */
  public GymLocation(String owner, String city, String weather, int population) {
    this.owner = owner;
    this.city = city;
    this.weather = weather;
    this.population = population;
  }

  /**
  * String representation of a gym 
  *
  * @return weather, city, owner, and population in a string
  */
  public String toString() {
    return "Welcome to the gym in " + weather + " " + city + "...\nOwner: " + owner + "\nPopulation: " + population;
  }

  /**
  * Getter method for owner 
  *
  * @return the owner of the gym
  */
  public String getOwner() {
    return owner;
  }

  /**
  * Getter method for city 
  *
  * @return the city containing the gym
  */
  public String getCity() {
    return city;
  }

  /**
  * Getter method for weather
  *
  * @return the weather of the city
  */
  public String getWeather() {
    return weather;
  }

  /**
  * Getter method for population
  *
  * @return the population of the city
  */
  public int getPopulation() {
    return population;
  }

}