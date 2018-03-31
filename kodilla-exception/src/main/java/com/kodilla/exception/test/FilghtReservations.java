package com.kodilla.exception.test;


import java.util.HashMap;
import java.util.Map;

public class FilghtReservations {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableFlights = new HashMap<>();
        availableFlights.put("Radom", false);
        availableFlights.put("Warszawa", true);
        availableFlights.put("Gdansk", true);
        availableFlights.put("London", false);
        availableFlights.put("Frankfurt", true);

        if (!availableFlights.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Gdansk", "Berlin");

        FilghtReservations filghtReservations = new FilghtReservations();

        try {
            filghtReservations.findFlight(flight);
            System.out.println("Pomyślnie znaleziono twój lot!");
        } catch (RouteNotFoundException e) {
            System.out.println("Nie znalaziono lotu. " + e);
        } finally {
            System.out.println("Dziekujemy za skorzystanie z wyszukiwarki.");
        }
    }

}
