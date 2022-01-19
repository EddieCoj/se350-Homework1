import java.util.Objects;

public class Airline {
	
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
		airlineName = aName;
	}
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline:", getAirlineName()));
        return sb.toString();
    }

	@Override
	public int hashCode() {
		return Objects.hash(airlineName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airlineName == null) {
			if (other.airlineName != null)
				return false;
		} else if (!airlineName.equals(other.airlineName))
			return false;
		return true;
	}	
}

