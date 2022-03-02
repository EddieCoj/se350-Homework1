import java.util.Date;
import java.util.Optional;

public class TravelManager {

    public static void main(String[] args) throws Exception {

    	 Airline airline = AirlineFactory.getAirline("Spirit");
         Airport origin = AirportFactory.getAirport("ORD");
         Airport destination = AirportFactory.getAirport("DFW");

         String flightNumber = FlightManager.getInstance().createFlight("commercialFlight", airline, origin, destination, 0);
         String flightNumber2 = FlightManager.getInstance().createFlight("passengerFlight", airline, origin, destination, 88);

         Optional<Flight> flight = FlightManager.getInstance().getFlightByFlightNumber(flightNumber);
         Optional<Flight> flight2 = FlightManager.getInstance().getFlightByFlightNumber(flightNumber2);

         System.out.println(flight.get());
         System.out.println(flight2.get());

    }

}
