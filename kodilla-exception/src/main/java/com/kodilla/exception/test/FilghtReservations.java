package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FilghtReservations {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableFlights = new HashMap<>();
        availableFlights.put("Radom", false);
        availableFlights.put("Warszawa", true);
        availableFlights.put("Gdansk", true);
        availableFlights.put("London", false);
        availableFlights.put("Frankfurt", true);

        if (!availableFlights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
        return availableFlights.get(flight.getArrivalAirport());
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Gdansk", "London");

        FilghtReservations filghtReservations = new FilghtReservations();

        try {
            if (filghtReservations.findFlight(flight)) {
                System.out.println("Lot dostepny!");
            } else {
                System.out.println("Lot niedostepny!");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Nie znalaziono takiego polaczenia. " + e);
        } finally {
            System.out.println("Dziekujemy za skorzystanie z wyszukiwarki ");
        }
    }

}
