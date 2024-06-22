/**
 * This class represents an Aircraft entity for a server-side API.
 * It incorporates properties such as the aircraft ID, city, seating, passengers, and a list of associated airports.
 * Created by: Austin R.
 */
package org.keyin.S4Sprint1.Aircraft;

import org.keyin.S4Sprint1.Airports.Airports;

import java.util.List;

public class Aircraft {
    // Variables representing the properties of an Aircraft
    private int aircraftID;
    private String city;
    private int seating;
    private List<Airports> airports;
    private int passengers;

    /**
     * Default constructor for the Aircraft entity.
     */
    public Aircraft() {
    }

    /**
     * Constructor for the Aircraft entity with parameters.
     * @param aircraftID The ID of the aircraft.
     * @param city The city where the aircraft is located.
     * @param seating The seating capacity of the aircraft.
     * @param passengers The number of passengers in the aircraft.
     */
    public Aircraft(Long aircraftID, String city, int seating, int passengers) {
        this.aircraftID = Math.toIntExact(aircraftID);
        this.city = city;
        this.seating = seating;
    }

    // Getters and Setters for the Aircraft entity

    /**
     * @return The ID of the aircraft.
     */
    public Long getAircraftID() {
        return (long) aircraftID;
    }

    /**
     * @param aircraftID The ID to set for the aircraft.
     */
    public void setAircraftID(Long aircraftID) {
        this.aircraftID = Math.toIntExact(aircraftID);
    }

    /**
     * @return The city where the aircraft is located.
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city to set for the aircraft.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The seating capacity of the aircraft.
     */
    public int getSeating() {
        return seating;
    }

    /**
     * @param seating The seating capacity to set for the aircraft.
     */
    public void setSeating(int seating) {
        this.seating = seating;
    }

    /**
     * @return The number of passengers in the aircraft.
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * @param passengers The number of passengers to set for the aircraft.
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    // Methods for the Service class

    /**
     * This method is used to add an airport to the aircraft's list of airports.
     * @param airport The airport to be added.
     */
    public void addAirport(Airports airport) {
        airports.add(airport);
    }

    /**
     * @return A list of airports associated with the aircraft.
     */
    public List<Airports> getAirports() {
        return airports;
    }

    /**
     * This method removes an airport from the aircraft's list of airports.
     * It takes the ID of the airport and removes the corresponding Airports object from the list.
     * @param airportId The ID of the airport to be removed.
     */
    public void deleteAirport(Long airportId) {
        airports.removeIf(airport -> airport.getAirportID() == airportId);
    }

    /**
     * @return A string representation of the Aircraft entity.
     */
    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftID=" + aircraftID +
                ", city='" + city + '\'' +
                ", seating=" + seating +
                ", passengers=" + passengers +
                '}';
    }
}

