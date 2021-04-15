package myproject.hiber.DBCreation;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="places")
public class places {
	@Id
	private int Id;
	private String Source;
	private String Destination;
	
	
	public places(int id, String source, String destination) {
		super();
		Id = id;
		Source = source;
		Destination = destination;
	}
	@Override
	public String toString() {
		return "places [Id=" + Id + ", Source=" + Source + ", Destination=" + Destination + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	
}
