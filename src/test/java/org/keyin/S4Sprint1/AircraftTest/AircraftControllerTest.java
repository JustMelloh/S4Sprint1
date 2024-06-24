package org.keyin.S4Sprint1.AircraftTest;

import org.junit.jupiter.api.Test;
import org.keyin.S4Sprint1.Aircraft.Aircraft;
import org.keyin.S4Sprint1.Aircraft.AircraftService;
import org.keyin.S4Sprint1.Cities.Cities;
import org.keyin.S4Sprint1.Passengers.Passengers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AircraftControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AircraftService aircraftService;

    @Test
    public void testGetAllAircraft() throws Exception {
        // Arrange
        Aircraft aircraft1 = new Aircraft(1L, new Cities(), 150, List.of(new Passengers()), 200);
        Aircraft aircraft2 = new Aircraft(2L, new Cities(), 200, List.of(new Passengers()), 300);
        List<Aircraft> aircraftList = Arrays.asList(aircraft1, aircraft2);

        when(aircraftService.getAllAircraft()).thenReturn(aircraftList);

        // Act and Assert
        mockMvc.perform(get("/api/aircraft"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'aircraftID': 1, 'seating': 150, 'capacity': 200}, {'aircraftID': 2, 'seating': 200, 'capacity': 300}]"));

        System.out.println("Get all aircraft test passed" + "\n" + "Aircraft 1: " + aircraft1 + "\n" + "Aircraft 2: " + aircraft2);
    }


}