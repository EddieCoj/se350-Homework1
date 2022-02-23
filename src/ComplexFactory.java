
import java.util.HashMap;
import java.util.Map;

public class ComplexFactory {
	private static Map<String, Complex> ComplexCache = new HashMap<>();
	
	private ComplexFactory() {}
	
	public static Complex getComplex(String airportName) {
        return ComplexCache.computeIfAbsent(airportName, newAirportName -> {
            try {
				return new Airport(airportName);
			} catch (NullParameterException | BadParameterException e) {
				return null;
			}
        });
	}

}
