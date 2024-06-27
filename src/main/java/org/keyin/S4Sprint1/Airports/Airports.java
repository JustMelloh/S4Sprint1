/* Creating Airport package for the API which allows client-side to view airports, what city.*/

package org.keyin.S4Sprint1.Airports;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Cities.Cities;
import java.util.List;
public class Airports {

    private Integer airportID;
    private Cities city;
    private List<Aircraft> aircraftID;

    public Airports() {
    }

    public Airports(Integer airportID, Cities city,  List<Aircraft>aircraft) {
        this.airportID = airportID;
        this.city = city;
        this.aircraftID = aircraft;
    }


    public Integer getAirportID() {
        return airportID;
    }

    public void setAirportID(Integer airportID) {
        this.airportID = airportID;
    }

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public List<Aircraft> getAircraft() {
        return aircraftID;
    }

    public void setAircraft(List<Aircraft> aircraft) {
        this.aircraftID = aircraft;
    }

    @Override
    public String toString() {
        return "Airports{" +
                "airportID=" + airportID +
                ", city='" + city + '\'' +
                ", aircraftID=" + aircraftID +
                '}';
    }
}