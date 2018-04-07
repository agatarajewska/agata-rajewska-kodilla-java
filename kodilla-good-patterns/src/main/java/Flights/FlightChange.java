package Flights;

import java.util.List;

public class FlightChange {

    private final String depratureAirport;
    private final List<Flight> flights;

    public FlightChange(String depratureAirport, List<Flight> flights) {
        this.depratureAirport = depratureAirport;
        this.flights = flights;
    }

    public void printPossibleFlights(){
        for(Flight f : flights){
            System.out.println(depratureAirport +" -> "+f.getDepartureAirport()+" -> "+f.getArrivalAirport());
        }
    }
}
