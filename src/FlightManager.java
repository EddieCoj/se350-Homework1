import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class FlightManager implements ExpensiveObject {

    private static FlightManager ourInstance;
    private static List<Flight> flights;

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager() {
    	flights = new ArrayList<Flight>();
    }

	@Override
	public String createFlight(String type, Airline airline, Airport origin, Airport destination, int cap) throws BadParameterException {
		Flight flight = FlightFactory.createFlight(type, airline, origin, destination, cap);
        flights.add(flight);
        return flight.getFlightNumber();
		
	}

	@Override
	public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
		return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
	}
	
//  public String createFlight(String type, Airline airline, Airport origin, Airport destination, int cap) throws BadParameterException {
//  Flight flight = FlightFactory.createFlight(type, airline, origin, destination, cap);
//  flights.add(flight);
//  
//  return flight.getFlightNumber();
//}
//
//public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
//  return flights.stream()
//          .filter(flt -> flt.getFlightNumber().equals(flightNumber))
//          .findFirst();
//}
	
}
