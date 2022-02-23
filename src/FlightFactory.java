
public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int cap) {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException | BadParameterException e) {
                return null;
            }
        }
        
        else if (type.equals("passengerFlight")) {
        	try {
				return new PassengerFlight(airline, origin, destination, cap);
			} catch (NullParameterException | BadParameterException e) {
				return null;
			}
        }

        else return null;
    }
}
