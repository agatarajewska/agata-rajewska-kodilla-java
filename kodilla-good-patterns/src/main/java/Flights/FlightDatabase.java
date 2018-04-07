package Flights;

public class FlightDatabase {

    public FlightList loadFlights(){

        FlightList flightList = new FlightList();

        flightList.addFlight(new Flight("Warszawa", "Gdansk"));
        flightList.addFlight(new Flight("Warszawa", "Lublin"));
        flightList.addFlight(new Flight("Warszawa", "Londyn"));
        flightList.addFlight(new Flight("Warszawa", "Radom"));
        flightList.addFlight(new Flight("Warszawa", "Berlin"));
        flightList.addFlight(new Flight("Lublin", "Radom"));
        flightList.addFlight(new Flight("Lublin", "Warszawa"));
        flightList.addFlight(new Flight("Gdansk", "Warszawa"));
        flightList.addFlight(new Flight("Gdansk", "Lublin"));
        flightList.addFlight(new Flight("Berlin", "Londyn"));
        flightList.addFlight(new Flight("Berlin", "Lublin"));


        return flightList;
    }
}
