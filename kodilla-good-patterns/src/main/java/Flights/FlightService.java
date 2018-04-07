package Flights;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlightService {

    private FlightList flightList;

    public FlightService(FlightList flightList){
        this.flightList = flightList;
    }

    public List<Flight> searchFlightsByDepartureAirport(String departureAirport){

        System.out.println("Searching flights by departure airport...");

        return flightList.getFlights().stream()
                .filter( f -> f.getDepartureAirport().equals(departureAirport))
                .collect(toList());
    }

    public List<Flight> searchFlightsByArrivalAirport(String arrivalAirport){

        System.out.println("Searching flights by arrival airport...");

        return flightList.getFlights().stream()
                .filter( f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(toList());
    }

    public FlightChange searchFlightsWithChange(String departureAirport, String arrivalAirport){

        System.out.println("Searching flights with change...");

        List<String> changePlaces = flightList.getFlights().stream()
                .filter( f -> f.getDepartureAirport().equals(departureAirport))
                .collect(toList())
                .stream()
                .map( pf -> pf.getArrivalAirport()).collect(toList());

        return new FlightChange(departureAirport, flightList.getFlights().stream()
                .filter( f-> changePlaces.contains(f.getDepartureAirport()) && arrivalAirport.equals(f.getArrivalAirport()))
                .collect(toList()));
    }
}
