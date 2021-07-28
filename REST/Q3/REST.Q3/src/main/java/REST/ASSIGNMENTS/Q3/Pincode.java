package REST.ASSIGNMENTS.Q3;

public class Pincode {

	private int pin;
	private String state;
	private String city;
	private String country;
	
	public Pincode(int pin, String state, String city, String country) {
		super();
		this.pin = pin;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	
	public int getPin() {return pin;}
	public void setPin(int pin) {this.pin = pin;}
	
	public String getState() {return state;}
	public void setState(String state) {this.state = state;}
	
	public String getCity() {return city;}
	public void setCity(String city) {this.city = city;}
	
	public String getCountry() {return country;}
	public void setCountry(String country) {this.country = country;}
	
}
