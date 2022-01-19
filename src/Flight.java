
import java.util.Date;
import java.util.UUID;

public class Flight {
	
	private Airline airline;
	private Airport origine;
	private Airport destination;
	private Date depatureTime;
	private String flightNumber;

	public Flight(Airline line, Airport port1, Airport port2, Date time)
			throws NullParameterException, BadParameterException {
		setAirline(line);
		setOrigine(port1);
		setDestination(port2);
		setDepartureTime(time);
		setFlightNumber();
		
	}
	
	public Airline getAirline() {
        return airline;
    }
	
	public Airport getOrigine() {
		return origine;
	}
	
	public Airport getDestination() {
		return destination;
	}
	
	public Date getDate() {
		return depatureTime;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}

	private void setAirline(Airline line) 
			throws NullParameterException {
		if (line == null) {
            throw new NullParameterException("Null value passed to setAirline");
        }
		airline = line;
	}

	private void setOrigine(Airport port1) 
			throws NullParameterException {
		if (port1 == null) {
			throw new NullParameterException("Null value passed to setOrigine");	
		}
		origine = port1;
	}

	private void setDestination(Airport port2) 
			throws NullParameterException {
		if (port2 == null) {
			throw new NullParameterException("Null value passed to setDestination");	
		}
		destination = port2;
	}

	private void setDepartureTime(Date time) 
			throws NullParameterException {
		if (time == null) {
			throw new NullParameterException("Null value passed to setDepartureTime");	
		}
		depatureTime = time;
	}

	private void setFlightNumber() {
		UUID number = UUID.randomUUID();
		flightNumber = number.toString();
	}
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline:", getAirline()));
        sb.append(String.format("%-20s %s%n", "Origine:", getOrigine()));
        sb.append(String.format("%-20s %s%n", "Destination:", getDestination()));
        sb.append(String.format("%-20s %s%n", "Date:", getDate()));
        sb.append(String.format("%-20s %s%n", "FlightNumber:", getFlightNumber()));
        
        return sb.toString();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
		result = prime * result + ((depatureTime == null) ? 0 : depatureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((origine == null) ? 0 : origine.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		if (depatureTime == null) {
			if (other.depatureTime != null)
				return false;
		} else if (!depatureTime.equals(other.depatureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (origine == null) {
			if (other.origine != null)
				return false;
		} else if (!origine.equals(other.origine))
			return false;
		return true;
	}
	
	
}







