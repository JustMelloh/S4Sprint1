package org.keyin.S4Sprint1.Passengers;

import java.util.ArrayList;
import java.util.List;

public class Passengers {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<Long> aircrafts = new ArrayList<>();

    public Passengers(Long id, String firstName, String lastName, String phoneNumber, List<Long> aircrafts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.aircrafts = aircrafts;
    }

    public Passengers() {

    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Long> getAircrafts() {
        return aircrafts;
    }

    public void addAircraft(Long aircraft) {
        aircrafts.add(aircraft);
    }
    
}
