package myproject.hiber.DBCreation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class flights {

	@Id
	private int FlightID;
	private String Name;
	private String Source;
	private String Destination;
	private String Day;
	private String TicketPrice;
	
	
	public flights(int flightID, String name, String source, String destination, String day, String ticketPrice) {
		super();
		this.FlightID = flightID;
		this.Name = name;
		this.Source = source;
		this.Destination = destination;
		this.Day = day;
		this.TicketPrice = ticketPrice;
	}
	
	public int getFlightID() {
		return FlightID;
	}
	public void setFlightID(int flightID) {
		this.FlightID = flightID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		this.Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		this.Destination = destination;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		this.Day = day;
	}
	public String getTicketPrice() {
		return TicketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.TicketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "flights [FlightID=" + FlightID + ", Name=" + Name + ", Source=" + Source + ", Destination="
				+ Destination + ", Day=" + Day + ", TicketPrice=" + TicketPrice + "]";
	}

	
	
	
}
