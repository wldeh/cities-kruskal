package Kruskal;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * <pre>
 * Class        City
 * Description  Represents a city with attributes including name, state, area,
 *              population, and a unique identifier.
 * Platform     jdk 1.8.0_241; PC Windows 11
 * Date         11/28/2023
 * History Log
 * </pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class City {

  private String name;
  private String state;
  private double area;
  private int population;
  private int id;

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Constructor  City
   * Description  Creates a new City instance with the specified id, name,
   *              state, area, and population.
   * Date         11/28/2023
   * History Log
   * @param       id The unique identifier for the city.
   * @param       name The name of the city.
   * @param       state The state in which the city is located.
   * @param       area The area of the city in square miles or kilometers.
   * @param       population The population of the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public City(int id, String name, String state, double area, int population) {
    this.id = id;
    this.name = name;
    this.state = state;
    this.area = area;
    this.population = population;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getId
   * Description  Returns the id
   * Date         11/28/2023
   * History Log
   * @return      The ID of the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public int getId() {
    return id;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       setId
   * Description  Sets the id.
   * Date         11/28/2023
   * History Log
   * @param       id The new ID to set for the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void setId(int id) {
    this.id = id;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getName
   * Description  Retrieves the name of the city.
   * Date         11/28/2023
   * History Log
   * @return      The name of the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public String getName() {
    return name;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       setName
   * Description  Sets the name of the city.
   * Date         11/28/2023
   * History Log
   * @param       name The new name to set for the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void setName(String name) {
    this.name = name;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getState
   * Description  Retrieves the state
   * Date         11/28/2023
   * History Log
   * @return      The state of the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public String getState() {
    return state;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       setState
   * Description  Sets the state
   * Date         11/28/2023
   * History Log
   * @param       state The new state
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void setState(String state) {
    this.state = state;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getArea
   * Description  Retrieves the area of the city in square miles or kilometers.
   * Date         11/28/2023
   * History Log
   * @return      The area of the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public double getArea() {
    return area;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       setArea
   * Description  Sets the area of the city in square miles or kilometers.
   * Date         11/28/2023
   * History Log
   * @param       area The new area to set for the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void setArea(double area) {
    this.area = area;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       getPopulation
   * Description  Retrieves the population
   * Date         11/28/2023
   * History Log
   * @return      The population of the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public int getPopulation() {
    return population;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       setPopulation
   * Description  Sets the population
   * Date         11/28/2023
   * History Log
   * @param       population The new population to set for the city.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  public void setPopulation(int population) {
    this.population = population;
  }

  /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * <pre>
   * Method       toString
   * Description  Returns a string representation of the City object.
   * Date         11/28/2023
   * History Log
   * @return      String representation of the City object.
   * </pre>
   *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  @Override
  public String toString() {
    return this.name;
  }
}
