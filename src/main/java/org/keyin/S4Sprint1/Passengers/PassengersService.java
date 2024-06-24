package org.keyin.S4Sprint1.Passengers;
import org.springframework.stereotype.Service;
import java.util.*;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Airports.*;

@Service
public class PassengersService {
    private final Map<Long, Passengers> allPassengers = new HashMap<>();
    private Long nextPassenger = 1L;

    public List<Passengers> getPassengers() {
        return new ArrayList<>(allPassengers.values());
    }

    public Passengers addPassenger(Passengers passenger) {
        passenger.setId(nextPassenger++);
        allPassengers.put(passenger.getId(), passenger);
        System.out.println("Passenger added successfully");
        return passenger;
    }

    public Passengers getPassengerById(Long id) {
        return allPassengers.get(id);
    }

    public Passengers getPassengerByPhone(String phoneNumber) {
        for (Passengers passenger : allPassengers.values()) {
            if (passenger.getPhoneNumber().equals(phoneNumber)) {
                return passenger;
            }
        }
        return null;
    }

    public Passengers updatePassengers(Long id, Passengers passenger) {
        passenger.setId(id);
        allPassengers.put(id, passenger);
        System.out.println("Passenger updated successfully");
        return passenger;
    }

    public void deletePassenger(Long id) {
        allPassengers.remove(id);
        System.out.println("Passenger deleted successfully");
    }

    public void addAircraftToPassenger(Passengers passengers, Long aircraft) {
        passengers.addAircraft(aircraft);
    }

    public List<Aircraft> getAircraftForPassenger(Passengers passengers) {
        List<Aircraft> aircrafts = new ArrayList<>();
        for (Long aircraftId : passengers.getAircrafts()) {
            Aircraft aircraft = new Aircraft();
            aircraft.setAircraftID(aircraftId);
            aircrafts.add(aircraft);
        }
        return aircrafts;
    }

    public List<Airports> addAirportToPassenger(Passengers passengers, Airports airports) {
        passengers.addAirport(airports);
        return passengers.getAirports();
    }

    public List<Airports> getAirportsForPassenger(Passengers passengers) {
        return passengers.getAirports();
    }

    public void deleteAircraftFromPassenger(Passengers passengers, Long aircraftId) {
        passengers.getAircrafts().remove(aircraftId);
    }

    public void deleteAirportFromPassenger(Passengers passengers, Airports airport) {
        passengers.getAirports().remove(airport);
    }
}
