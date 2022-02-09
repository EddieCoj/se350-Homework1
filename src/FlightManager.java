import java.util.ArrayList;
import java.util.List;

public final class FlightManager {

    private static FlightManager ourInstance;
    private List<Flight> flights = new ArrayList();

    public static FlightManager getInstance() throws Exception {
        if (ourInstance == null)
            ourInstance = new FlightManager();

        return ourInstance;
    }

    private FlightManager() {
    }

    public void createFlight(String type, Airline line, Airport port1, Airport port2) throws NullParameterException, BadParameterException{
    	Flight newFlight = FlightFactory.createFlight(type, line, port1, port2);
    	flights.add(newFlight);
    }
    
    public Flight getFlightByNumber(String flightNum) {
    	for (int i = 0; i < flights.size(); i++) {
    		if (flights.get(i).getFlightNumber() == flightNum)
    			return flights.get(i);
    	}
		return null;
    }
	
}
