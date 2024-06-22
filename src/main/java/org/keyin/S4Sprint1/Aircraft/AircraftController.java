/* Controller for the Aircraft to allow the Client to view and map the Aircraft*/

package org.keyin.S4Sprint1.Aircraft;


import org.keyin.S4Sprint1.Airports.Airports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.keyin.S4Sprint1.Passengers.Passengers;

import java.util.List;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {

        private final AircraftService aircraftService;

        @Autowired
        public AircraftController(AircraftService aircraftService) {
            this.aircraftService = aircraftService;
        }

        /* Endpoint to receive all aircraft*/
        @GetMapping
        public List<Aircraft> getAllAircraft() {
            return aircraftService.getAllAircraft();
        }

        /* Endpoint to GET aircraft by ID*/
        @GetMapping("/{id}")
        public Aircraft getAircraftById(@PathVariable Long id) {
            return aircraftService.getAircraftById(id);
        }

        /* Endpoint to add an aircraft*/
        @PostMapping
        public Aircraft addAircraft(@RequestBody Aircraft aircraft) {
            return aircraftService.addAircraft(aircraft);
        }

        /* Endpoint that updates to existing aircraft*/
        @PutMapping("/{id}")
        public Aircraft updateAircraft(@PathVariable Long id, @RequestBody Aircraft aircraft) {
            return aircraftService.updateAircraft(id, aircraft);
        }

        // Endpoint to delete a Aircraft
        @DeleteMapping("/{id}")
        public void deleteAircraft(@PathVariable Long id) {
            aircraftService.deleteAircraft(id);
        }

        /* Adding an airport to a specific Aircraft*/

    @PostMapping("/{id}/airports")
    public Aircraft addAirportToAircraft(@PathVariable Long id, @RequestBody Airports airports) {
        return aircraftService.addAirportToAircraft(id, airports);
    }

    /* GET all airports for a specific aircraft*/
    @GetMapping("/{id}/airports")
    public List<Airports> getAirportsForAircraft(@PathVariable Long id) {
        return aircraftService.getAirportsForAircraft(id);
    }

    /* DELETE an airport from a specific aircraft*/
    @DeleteMapping("/{id}/airports/{airportId}")
    public void deleteAirportFromAircraft(@PathVariable Long id, @PathVariable Long airportId) {
        aircraftService.deleteAirportFromAircraft(id, airportId);
    }

    @GetMapping("/{id}/seating")
    public int getSeating(@PathVariable Long id) {
        return aircraftService.getSeating(id);
    }

    @PutMapping("/{id}/seating/{seating}")
    public void setSeating(@PathVariable Long id, @PathVariable int seating) {
        aircraftService.setSeating(id, seating);
    }

    @GetMapping("/{id}/capacity")
    public int getCapacity(@PathVariable Long id) {
        return aircraftService.getCapacity(id);
    }

    @PutMapping("/{id}/capacity")
    public void setCapacity(@PathVariable Long id, @RequestBody int capacity) {
        aircraftService.setCapacity(id, capacity);
    }

    @PostMapping("/{id}/passengers")
    public Aircraft addPassengerToAircraft(@PathVariable Long id, @RequestBody Passengers passengers) {
        return aircraftService.addPassengerToAircraft(id, passengers);
    }

}
