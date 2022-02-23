import java.util.Objects;

public class Airport implements Complex{
	
	private String airportName;
	
	public Airport(String name)
			throws NullParameterException, BadParameterException {
		setAirportName(name);
	}
	
	public String getAirportName() {
        return airportName;
    }
	
	private void setAirportName(String aName) throws NullParameterException, BadParameterException {
		if (aName == null) {
            throw new NullParameterException("Airport name cannot be null.");
        }
        if (aName.length() != 3 || !aName.equals(aName.toUpperCase())) {
            throw new BadParameterException("Invalid name.");
        }
		
		this.airportName = aName;
	}
	
	public String toString() {
        return "Airport{" +
                "name='" + getAirportName() + '\'' +
                '}';
    }

	@Override
	public int hashCode() {
		return Objects.hash(airportName);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getAirportName(), airport.getAirportName());
	}
	
}
