import java.util.Date;

public class TravelManager {
	public static void main(String[] args) throws NullParameterException, BadParameterException {
		Airport airport1 = new Airport("JFK");
		Airport airport2 = new Airport("LAX");
		
		Airline airline = new Airline("Delta");
		
		Flight flight = new Flight(airline, airport1, airport2, new Date());
		
		System.out.println(flight);
		
	}
	
}
