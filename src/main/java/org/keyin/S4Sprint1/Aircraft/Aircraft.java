/* Creating an Aircraft Entity for the Server-side API, incorporates, the city, seating and passengers and aircraft ID
* Created by: Austin R.*/

package org.keyin.S4Sprint1.Aircraft;

public class Aircraft {
    /* Instantiate the variables*/

    private int aircraftID;
    private String city;
    private int seating;
    private int passengers;

    /* Constructor for the Aircraft Entity */

    public Aircraft() {
    }

    public Aircraft(Long aircraftID, String city, int seating, int passengers) {
        this.aircraftID = Math.toIntExact(aircraftID);
        this.city = city;
        this.seating = seating;
        this.passengers = passengers;
    }

    /* Getters and Setters for the Aircraft Entity */

    public Long getAircraftID() {
        return (long) aircraftID;
    }

    public void setAircraftID(Long aircraftID) {
        this.aircraftID = Math.toIntExact(aircraftID);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /* toString method for the Aircraft Entity */

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
