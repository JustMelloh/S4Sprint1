package org.keyin.S4Sprint1.Airports;

import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is the service class for the Airports entity.
 * It handles the business logic for managing airports.
 */
@Service
public class AirportsService {

    /**
     * A map to store airports with their IDs as keys.
     */
    private final Map<Long, Airports> airportsMap = new HashMap<>();

    /**
     * This method returns all airports.
     * @return A list of all airports.
     */
    public List<Airports> getAllAirports() {
        return new ArrayList<>(airportsMap.values());
    }

    /**
     * This method returns all aircraft at a specific airport.
     * @param id The ID of the airport.
     * @return A list of all aircraft at the specified airport.
     */
    public List<Aircraft> getAircraftAtAirport(Long id) {
        Airports airport = airportsMap.get(id);
        return airportsMap.get(id).getAircraft();
    }

    /**
     * This method returns an airport by its ID.
     * @param id The ID of the airport.
     * @return The airport with the given ID.
     */
    public Airports getAirportById(Long id) {
        return airportsMap.get(id);
    }

    /**
     * This method adds a new airport.
     * @param airport The airport to be added.
     * @return The added airport.
     * @throws IllegalArgumentException If the airport already exists.
     */
    public Airports addAirport(Airports airport) {
        if (airportsMap.containsKey(airport.getAirportID())) {
            throw new IllegalArgumentException("Airport already exists");
        }

        airportsMap.put(airport.getAirportID(), airport);
        return airport;
    }

    /**
     * This method adds an airport to a specific aircraft.
     * @param id The ID of the aircraft.
     * @param airport The airport to be added to the aircraft.
     * @return The added airport.
     */
    public Airports addAirportToAircraft(Long id, Airports airport) {
        Aircraft aircraft = new Aircraft();
        aircraft.addAirport(airport);
        return airport;
    }

    /**
     * This method updates an existing airport.
     * @param id The ID of the airport to be updated.
     * @param airport The updated airport.
     * @return The updated airport.
     * @throws IllegalArgumentException If the airport does not exist.
     */
    public Airports updateAirport(Long id, Airports airport) {
        if (!airportsMap.containsKey(id)) {
            throw new IllegalArgumentException("Airport does not exist");
        }
        airportsMap.put(id, airport);
        return airport;
    }

    /**
     * This method deletes an airport.
     * @param id The ID of the airport to be deleted.
     * @return A boolean indicating whether the deletion was successful.
     */
    public boolean deleteAirport(Long id) {
        return airportsMap.remove(id) != null;
    }

}
