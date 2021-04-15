package myproject.hiber.DBCreation;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="airlines")
public class airlines {
	@Id
	private int Id;
	private String Airline;
	
	
	
	public airlines(int id, String airline) {
		super();
		Id = id;
		Airline = airline;
	}
	@Override
	public String toString() {
		return "airlines [Id=" + Id + ", Airline=" + Airline + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAirline() {
		return Airline;
	}
	public void setAirline(String airline) {
		Airline = airline;
	}
	
	
}
