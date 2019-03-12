package playIO;

import java.io.Serializable;

public class Address  implements Serializable    { 

	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;
	private String streetname;
	private String city;
	private String state;
	
	public Address(String streetname, String city, String state) {
		super();
		this.streetname = streetname;
		this.city = city;
		this.state = state;
	}
	
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
