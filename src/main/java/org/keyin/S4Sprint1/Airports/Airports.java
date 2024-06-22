/* Creating Airport package for the API which allows client-side to view airports, what city.*/

package org.keyin.S4Sprint1.Airports;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Cities.Cities;
import java.util.List;
public class Airports {

    private int airportID;
    private Cities city;
    private List<Aircraft> aircraft;

    public Airports() {
    }

    public Airports(int airportID, Cities city,  List<Aircraft>aircraft) {
        this.airportID = airportID;
        this.city = city;
        this.aircraft = aircraft;
    }

    public long getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public List<Aircraft> getAircraft() {
        return aircraft;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "airportID=" + airportID +
                ", city='" + city + '\'' +
                ", aircraftID=" + aircraft +
                '}';
    }
}
