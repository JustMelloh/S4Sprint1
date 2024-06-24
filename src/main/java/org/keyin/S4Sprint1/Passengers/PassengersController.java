package org.keyin.S4Sprint1.Passengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Airports.Airports;
import org.keyin.S4Sprint1.Airports.AirportsService;
import org.keyin.S4Sprint1.Passengers.*;

@RestController
@RequestMapping("/api/passengers")
public class PassengersController {
    private PassengersService passengersService;
    private AirportsService AirportsService;


    @Autowired
    public PassengersController(PassengersService passengersService, AirportsService AirportsService) {
        this.passengersService = passengersService;
        this.AirportsService = AirportsService;

    }

    @GetMapping
    public List<Passengers> getPassengers() {
        return passengersService.getPassengers();
    }

    @PostMapping
    public Passengers addPassenger(@RequestBody Passengers passenger) {
        return passengersService.addPassenger(passenger);
    }

    @GetMapping("/{id}")
    public Passengers getPassengerById(@PathVariable Long id) {
        return passengersService.getPassengerById(id);
    }

    @GetMapping("/phone/{phoneNumber}")
    public Passengers getPassengerByPhone(@PathVariable String phoneNumber) {
        return passengersService.getPassengerByPhone(phoneNumber);
    }

    @PutMapping("/{id}")
    public Passengers updatePassengers(@PathVariable Long id, @RequestBody Passengers passenger) {
        return passengersService.updatePassengers(id, passenger);
    }

    @DeleteMapping("/{id}")
    public void deletePassenger(@PathVariable Long id) {
        passengersService.deletePassenger(id);
    }

    @GetMapping("/{id}/aircraft")
    public List<Aircraft> getAircraftsForPassenger(@PathVariable Long id) {
        Passengers passenger = passengersService.getPassengerById(id);
        return passengersService.getAircraftForPassenger(passenger);
    }

    @DeleteMapping("/{id}/aircraft/{aircraftId}")
    public void deleteAircraftFromPassenger(@PathVariable Long id, @PathVariable Long aircraftId) {
        Passengers passenger = passengersService.getPassengerById(id);
        passengersService.deleteAircraftFromPassenger(passenger, aircraftId);
    }

    @GetMapping("/{id}/airport")
    public List<Airports> getAirportsForPassenger(@PathVariable Long id) {
        Passengers passenger = passengersService.getPassengerById(id);
        return passengersService.getAirportsForPassenger(passenger);
    }

    @PostMapping("/{id}/airport")
    public List<Airports> addAirportToPassenger(@PathVariable Long id, @RequestBody Airports airport) {
        Passengers passenger = passengersService.getPassengerById(id);
        return passengersService.addAirportToPassenger(passenger, airport);
    }

    @DeleteMapping("/{id}/airport/{airportId}")
    public void deleteAirportFromPassenger(@PathVariable Long id, @PathVariable Long airportId) {
        Passengers passenger = passengersService.getPassengerById(id);
        passengersService.deleteAirportFromPassenger(passenger, AirportsService.getAirportById(airportId));
    }
}
