package PokemonSimulation;

public class GymLocation {

  private String owner;
  private String city;
  private String weather;
  private int population;

  public GymLocation(String owner, String city, String weather, int population) {
    this.owner = owner;
    this.city = city;
    this.weather = weather;
    this.population = population;
  }

  public String toString() {
    return "Welcome to the gym in " + weather + " " + city + "...\nOwner: " + owner + "\nPopulation: " + population;
  }

  public String getOwner() {
    return owner;
  }

  public String getCity() {
    return city;
  }

  public String getWeather() {
    return weather;
  }

  public int getPopulation() {
    return population;
  }

  public void changePopulation(int amount) {
    population += amount;
  }

}