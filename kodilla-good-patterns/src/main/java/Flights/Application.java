package Flights;

public class Application {

    public static void main(String[] args) {

        FlightDatabase flightDatabase = new FlightDatabase();

        FlightService flightService = new FlightService(flightDatabase.loadFlights());

        flightService.searchFlightsByDepartureAirport("Warszawa").stream()
                .forEach(System.out::println);

        flightService.searchFlightsByArrivalAirport("Warszawa").stream()
                .forEach(System.out::println);

        FlightChange flightChange = flightService.searchFlightsWithChange("Lublin", "Berlin");
        flightChange.printPossibleFlights();
    }
}
