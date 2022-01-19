import java.util.Objects;

public class Airport {
	
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
            throw new NullParameterException("Null value passed in for setAirportName");
        }
		if (aName.length() <= 0 || aName.length() > 3) {
            throw new BadParameterException("Bad value passed to setAirportName: " + aName);
        }
		
		for (int i = 0; i < aName.length(); i++) {
			char ch = aName.charAt(i);
			if (ch < 65 || ch > 90) {
				throw new BadParameterException("Bad value passed to setAirportName: " + aName);
			}
		}
		airportName = aName;
	}
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport:", getAirportName()));
        return sb.toString();
    }

	@Override
	public int hashCode() {
		return Objects.hash(airportName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		return true;
	}
	
}
