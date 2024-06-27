package org.keyin.S4Sprint1.Aircraft;

import org.keyin.S4Sprint1.Airports.Airports;
import org.keyin.S4Sprint1.Airports.AirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AircraftService {
    /* Declaration of a HashMap that will be used to store AirCraft objects. */
    private final Map<Long, Aircraft> aircraftMap = new HashMap<>();
    private Long nextId = 1L;

    @Autowired
    private AirportsService airportsService;

    /* Retrieving all aircraft in airport*/
    public List<Aircraft> getAllAircraft() {
        return new ArrayList<>(aircraftMap.values());
    }

    /* Retrieving aircraft by ID*/

    public Aircraft getAircraftById(Long id) {
        return aircraftMap.get(id);
    }

    /* Adding an aircraft*/

    public Aircraft addAircraft(Aircraft aircraft, Integer airportID, Airports airports) {
        aircraft.setAircraftID(nextId++);
        aircraftMap.put(aircraft.getAircraftID(), aircraft);

        aircraft.addAirport(airports);


        Airports airport = airportsService.getAirportById(airportID);
        if (airport != null) {
            airport.addAircraft(aircraft);
            airportsService.updateAirport(airportID, airport);
        }

        return aircraft;
    }

    /* Updating an existing aircraft*/

    public Aircraft updateAircraft(Long id, Aircraft aircraft) {
        aircraft.setAircraftID(id);
        aircraftMap.put(id, aircraft);
        return aircraft;
    }

    /* Deleting an aircraft*/

    public void deleteAircraft(Long id) {
        aircraftMap.remove(id);
    }



    public List<Airports> getAirportsForAircraft(Long id) {
        Aircraft aircraft = aircraftMap.get(id);
        return aircraft.getAirports();
    }

    public void deleteAirportFromAircraft(Long id, Long airportId) {
        Aircraft aircraft = aircraftMap.get(id);
        aircraft.deleteAirport(airportId);
    }
}
