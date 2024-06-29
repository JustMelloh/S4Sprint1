/* Creating Airport package for the API which allows client-side to view airports, what city.*/

package org.keyin.S4Sprint1.Airports;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Cities.Cities;
import java.util.List;
public class Airports {

    private Integer airportID;
    private Cities city;
    private List<Aircraft> aircraftID;

    /**
     * Default constructor for the Airports class.
     */
    public Airports() {
    }

    /**
     * Constructs an Airports object with the given airport ID, city, and list of aircraft.
     *
     * @param airportID  the unique identifier for the airport
     * @param city  the city where the airport is located
     * @param aircraft  the list of aircraft at the airport
     */
    public Airports(Integer airportID, Cities city,  List<Aircraft>aircraft) {
        this.airportID = airportID;
        this.city = city;
        this.aircraftID = aircraft;
    }

    /**
     * Returns the airport ID.
     *
     * @return the airport ID
     */
    public Integer getAirportID() {
        return airportID;
    }

    /**
     * Sets the airport ID.
     *
     * @param airportID  the airport ID
     */
    public void setAirportID(Integer airportID) {
        this.airportID = airportID;
    }

    /**
     * Returns the city where the airport is located.
     *
     * @return the city
     */
    public Cities getCity() {
        return city;
    }

    /**
     * Sets the city where the airport is located.
     *
     * @param city  the city
     */
    public void setCity(Cities city) {
        this.city = city;
    }

    /**
     * Returns the list of aircraft at the airport.
     *
     * @return the list of aircraft
     */
    public List<Aircraft> getAircraft() {
        return aircraftID;
    }

    /**
     * Sets the list of aircraft at the airport.
     *
     * @param aircraft  the list of aircraft
     */
    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraftID = aircraft;
    }

    /**
     * Returns a string representation of the Airports object.
     *
     * @return a string representation of the Airports object
     */
    @Override
    public String toString() {
        return "Airports{" +
                "airportID=" + airportID +
                ", city='" + city + '\'' +
                ", aircraftID=" + aircraftID +
                '}';
    }
}