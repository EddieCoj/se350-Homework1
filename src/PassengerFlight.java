
import java.util.Date;
import java.util.UUID;

public class PassengerFlight implements Flight {

	private Airline airline;
	private Airport origin;
	private Airport destination;
	private Date departureTime;
	private String flightNumber;
	private int passengerCapacity;
	
	public PassengerFlight(Airline line, Airport port1, Airport port2, int cap)
			throws NullParameterException, BadParameterException {
		setAirline(line);
		setOrigin(port1);
		setDestination(port2);
		setDepartureTime();
		setFlightNumber();
		setPassengerCap(cap);
	}

	private void setPassengerCap(int cap) throws BadParameterException {
		if (cap <= 0) {
			throw new BadParameterException("0 value passed to setPassengerCap");
		}
		this.passengerCapacity = cap;
	}

	private void setAirline(Airline line) throws NullParameterException {
		if (line == null) {
			throw new NullParameterException("Null value passed to setAirline");
		}
		this.airline = line;
	}	
	
	private void setOrigin(Airport port1) throws NullParameterException {
		if (port1 == null) {
			throw new NullParameterException("Null value passed to setOrigine");	
		}
		this.origin = port1;
	}
	private void setDestination(Airport port2) throws NullParameterException {
		if (port2 == null) {
			throw new NullParameterException("Null value passed to setDestination");	
		}
		this.destination = port2;
	}

	private void setDepartureTime() {
		this.departureTime = new Date(2022, 05, 05, 13, 30);	
	}
	
	private void setFlightNumber() {
		UUID number = UUID.randomUUID();
		flightNumber = number.toString();	
	}
	
	@Override
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public String getAirline() {
        return airline.toString();
    }
	
	public String getOrigin() {
		return origin.toString();
	}
	
	public String getDestination() {
		return destination.toString();
	}
	
	public String getDate() {
		return departureTime.toString();
	}
	
	public int getPassengerCap() {
		return passengerCapacity;
	}
	
	public String toString() {
		return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber=" + getFlightNumber() +
                ", departureTime=" + getDate() +
                ", passengerCapacity=" + getPassengerCap() +
                '}';
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + passengerCapacity;
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
		PassengerFlight other = (PassengerFlight) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (passengerCapacity != other.passengerCapacity)
			return false;
		return true;
	}
		
}