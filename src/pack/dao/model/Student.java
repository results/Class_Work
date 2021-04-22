package pack.dao.model;

public class Student {
	
	public Student(int id, String firstname, String lastname,String street) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.street = street;
	}
	
	private int id;
	private String firstname;
	private String lastname;
	private String street;
	private String city;
	private String state;
	private int postalCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "ID: "+getId()+", first "+getFirstname()+", last "+getLastname()+", Add: "+getStreet();
	}

}
