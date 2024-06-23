package org.keyin.S4Sprint1.Passengers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.keyin.S4Sprint1.Aircraft.Aircraft;

@RestController
@RequestMapping("/api/passengers")
public class PassengersController {
    private PassengersService passengersService;


    @Autowired
    public PassengersController(PassengersService passengersService) {
        this.passengersService = passengersService;

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
}
