import java.util.Objects;

public class Airline implements AirService{
	
	private String airlineName;
	
	public Airline(String name)
			throws NullParameterException, BadParameterException {
		setAirlineName(name);
	}
	
	public String getAirlineName() {
        return airlineName;
    }
	
	private void setAirlineName(String aName) throws NullParameterException, BadParameterException {
		if (aName == null) {
            throw new NullParameterException("Null value passed in for setAirlineName");
        }
		if (aName.length() <= 0 || aName.length() > 8) {
            throw new BadParameterException("Bad value passed to setAirlineName: " + aName);
		}
		this.airlineName = aName;
	}
	
	public String toString() {
        return "Airline{" + "name='" + getAirlineName() + '\'' + '}';
    }

	@Override
	public int hashCode() {
		return Objects.hash(airlineName);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(airlineName, airline.airlineName);
	}	
}

