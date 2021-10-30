package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    List<Flight> flights = new ArrayList<>();

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addFlight(new Flight("A-1111", Status.ACTIVE));
        airport.addFlight(new Flight("B-2222", Status.DELETED));
        airport.addFlight(new Flight("C-3333", Status.DELETED));
        airport.addFlight(new Flight("D-4444", Status.ACTIVE));
        airport.addFlight(new Flight("E-5555", Status.DELETED));
        airport.addFlight(new Flight("F-6666", Status.ACTIVE));

        System.out.println(airport.getDeletedFlights());
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Deleted flights:\n");
        for (Flight flight : flights) {
            if (flight.getStatus().equals(Status.DELETED)) sb.append(flight.getFlightNumber()).append('\n');
        }
        return sb.toString();
    }
}
