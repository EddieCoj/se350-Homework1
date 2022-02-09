
public class FlightFactory {
    private FlightFactory() {
    }

	public static Flight createFlight(String type, Airline line, Airport port1, Airport port2) throws NullParameterException, BadParameterException {
		if (type.equals("CommercialFlight"))
            return new CommercialFlight(line, port2, port2);
		else return null;
	}

}
