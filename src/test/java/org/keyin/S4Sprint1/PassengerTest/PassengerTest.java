package org.keyin.S4Sprint1.PassengerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.keyin.S4Sprint1.Passengers.Passengers;

public class PassengerTest {

    private Passengers passenger;

    @BeforeEach
    void setUp() {
        // Initialize your Passengers object here
        passenger = new Passengers();
        // You can set up the object with some default values if needed
    }

    @Test
    void testPassengerAttributes() {
        passenger.setId(1L);
        assertEquals(1L, passenger.getId(), "The ID should be 1");

        passenger.setFirstName("John");
        passenger.setLastName("Doe");

        assertEquals("John", passenger.getFirstName(), "The first name should be John");
        assertEquals("Doe", passenger.getLastName(), "The last name should be Doe");
    }
}