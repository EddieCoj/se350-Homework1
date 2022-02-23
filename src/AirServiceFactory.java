
import java.util.HashMap;
import java.util.Map;

public class AirServiceFactory {
	private static Map<String, AirService> AirServiceCache = new HashMap<>();
	
	private AirServiceFactory() {}
	
	public static AirService getAirService(String airlineName) {
        return AirServiceCache.computeIfAbsent(airlineName, newAirlineName -> {
            try {
				return new Airline(airlineName);
			} catch (NullParameterException | BadParameterException e) {
				return null;
			}
        });
	}
}
