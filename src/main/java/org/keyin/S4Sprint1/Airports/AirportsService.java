package org.keyin.S4Sprint1.Airports;

import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AirportsService {

    private final Map<Integer, Airports> airportsMap = new HashMap<>();

    public List<Airports> getAllAirports() {
        return new ArrayList<>(airportsMap.values());
    }

    public List<Aircraft> getAircraftAtAirport(Integer id) {
        Airports airport = airportsMap.get(id);
        return airport.getAircraft();
    }

    public Airports getAirportById(Integer id) {
        return airportsMap.get(id);
    }

    public Airports addAirport(Airports airport) {
        if (airportsMap.containsKey(airport.getAirportID())) {
            throw new IllegalArgumentException("Airport already exists");
        }

        airportsMap.put(airport.getAirportID(), airport);
        return airport;
    }

    public Airports updateAirport(Integer id, Airports airport) {
        if (!airportsMap.containsKey(id)) {
            throw new IllegalArgumentException("Airport does not exist");
        }
        airportsMap.put(id, airport);
        return airport;
    }

    public boolean deleteAirport(Integer id) {
        return airportsMap.remove(id) != null;
    }

    public Airports addAircraftToAirport(Integer id, Aircraft aircraft) {
        Airports airport = airportsMap.get(id);
        if (airport != null) {
            List<Aircraft> aircraftList = airport.getAircraft();
            if (aircraftList == null) {
                aircraftList = new ArrayList<>();
                airport.setAircraft(aircraftList);
            }
            aircraftList.add(aircraft);

            airportsMap.put(id, airport);
        }
        return airport;
    }
}