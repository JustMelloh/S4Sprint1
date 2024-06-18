package org.keyin.S4Sprint1.Cities;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CitiesService {

    private final Map<Long, Cities> citiesMap = new HashMap<>();
    private Long nextId = 1L;

    // Method to retrieve all cities
    public List<Cities> getAllCities() {
        return new ArrayList<>(citiesMap.values());
    }

    // Method to retrieve a city by ID
    public Cities getCityById(Long id) {
        return citiesMap.get(id);
    }

    // Method to add a new city
    public Cities addCity(Cities city) {
        city.setId(nextId++);
        citiesMap.put(city.getId(), city);
        return city;
    }

    // Method to update an existing city
    public Cities updateCity(Long id, Cities city) {
        city.setId(id);
        citiesMap.put(id, city);
        return city;
    }

    // Method to delete a city
    public void deleteCity(Long id) {
        citiesMap.remove(id);
    }
}
