package org.keyin.S4Sprint1.Cities;

import org.keyin.S4Sprint1.Airports.Airports;
//import org.keyin.S4Sprint1.Passengers.Passenger;

import java.util.List;

public class Cities {
    private Long id;
    private String name;
    private String state;
    private int population;
    private List<Airports> airports;
//    private List<Passenger> passengers;

    // Constructor, getters, and setters
    public Cities() {}

    public Cities(Long id, String name, String state, int population, List<Airports> airports){
//        List<Passenger> passengers) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.population = population;
        this.airports = airports;
//        this.passengers = passengers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airports> getAirports() {
        return airports;
    }

    public void setAirports(List<Airports> airports) {
        this.airports = airports;
    }

//    public List<Passenger> getPassengers() {
//        return passengers;
//    }
//
//    public void setPassengers(List<Passenger> passengers) {
//        this.passengers = passengers;
//    }
}
