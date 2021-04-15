package myproject.hiber.DBCreation;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="admin")
public class admin {
	
	@Id
	private int Id;
	private String Userid;
	private String Password;
	
	public admin(int id, String userid, String password) {
		super();
		Id = id;
		Userid = userid;
		Password = password;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "admin [Id=" + Id + ", Userid=" + Userid + ", Password=" + Password + "]";
	}

}
