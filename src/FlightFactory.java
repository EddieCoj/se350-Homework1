
public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, int cap){
    	try {
            if (type.equals("commercialFlight")) {
                return new CommercialFlight(airline, origin, destination);
            } else if (type.equals("passengerFlight")) {
                return new PassengerFlight(airline, origin, destination, cap);
            }

        } catch(NullParameterException e) {
            return null;
        }

        return null;
    }
    	
}
