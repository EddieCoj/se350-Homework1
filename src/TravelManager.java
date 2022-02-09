import java.util.Date;

public class TravelManager {
	
	public static void main(String[] args) throws Exception {
		try {
            Airline airline = new Airline("Spirit");
            Airport origin = new Airport("ORD");
            Airport destination = new Airport("DFW");

            FlightManager.getInstance().createFlight("CommercialFlight", airline, origin, destination);
            
        } catch (NullParameterException ex) {
            ex.printStackTrace();
        } catch (BadParameterException ex) {
            ex.printStackTrace();
        }
		
	}
}
