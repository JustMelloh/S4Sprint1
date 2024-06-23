package org.keyin.S4Sprint1.AircraftTest;


import org.junit.jupiter.api.Test;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Cities.Cities;
import org.keyin.S4Sprint1.Passengers.Passengers;
import org.keyin.S4Sprint1.Airports.Airports;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AircraftTest {

    @Test
    void testAircraftConstructorAndGetters() {

        Long aircraftID = 1L;
        Cities city = new Cities();
        int seating = 150;
        List<Passengers> passengersList = new ArrayList<>();
        int capacity = 200;


        Aircraft aircraft = new Aircraft(aircraftID, city, seating, passengersList, capacity);


        assertEquals(aircraftID, aircraft.getAircraftID());
        assertEquals(city, aircraft.getCity());
        assertEquals(seating, aircraft.getSeating());
        assertEquals(capacity, aircraft.getCapacity());
        assertEquals(passengersList, aircraft.getPassengers());
    }

    @Test
    void testAircraftSetters() {

        Aircraft aircraft = new Aircraft();
        Long aircraftID = 1L;
        Cities city = new Cities();
        int seating = 150;
        int capacity = 200;

        aircraft.setAircraftID(aircraftID);
        aircraft.setCity(city);
        aircraft.setSeating(seating);
        aircraft.setCapacity(capacity);

        assertEquals(aircraftID, aircraft.getAircraftID());
        assertEquals(city, aircraft.getCity());
        assertEquals(seating, aircraft.getSeating());
        assertEquals(capacity, aircraft.getCapacity());

        System.out.print("Aircraft setters test passed" + "\n" + "Aircraft ID: " + aircraft.getAircraftID() + "\n" + "City: " + aircraft.getCity() + "\n" + "Seating: " + aircraft.getSeating() + "\n" + "Capacity: " + aircraft.getCapacity());
    }

    @Test
    void testAddAndDeletePassenger() {

        Aircraft aircraft = new Aircraft();
        Passengers passenger = new Passengers();
    }


}

