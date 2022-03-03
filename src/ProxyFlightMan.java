import java.util.Optional;

public class ProxyFlightMan implements ExpensiveObject {
	
	private  static ExpensiveObject object;

	@Override
	public String createFlight(String type, Airline airline, Airport origin, Airport destination, int cap)
			throws BadParameterException {
		System.out.println("A flight is being created.");
		
		if (object == null) {
			object = new FlightManager();
		}
		object.createFlight(type, airline, origin, destination, cap);

	}

	@Override
	public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
		System.out.println("Flight number: " + flightNumber + " is being retrieved.");
		
		if (object == null) {
			object = new FlightManager();
		}
		object.getFlightByFlightNumber(flightNumber);
		
	}

}
