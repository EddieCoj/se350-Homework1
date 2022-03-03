import java.util.Optional;

public interface ExpensiveObject {
	String createFlight(String type, Airline airline, Airport origin, Airport destination, int cap)
			throws BadParameterException;
	Optional<Flight> getFlightByFlightNumber(String flightNumber);
}
