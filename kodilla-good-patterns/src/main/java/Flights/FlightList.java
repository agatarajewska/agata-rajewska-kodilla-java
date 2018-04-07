package Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private final List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public boolean removeFlight(Flight flight){
        return flights.remove(flight);
    }

    public List<Flight> getFlights(){
        return new ArrayList<>(flights);
    }
}
