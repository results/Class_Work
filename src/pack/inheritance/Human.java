package pack.inheritance;

public class Human extends LivingThing {

	public Human() {
		super();
	}
	
	protected String name;
	protected String address;
	protected String senseofHumor;
	protected boolean maritalStatus;
	protected String nationality;
	protected String cooking;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSenseofHumor() {
		return senseofHumor;
	}
	public void setSenseofHumor(String senseofHumor) {
		this.senseofHumor = senseofHumor;
	}
	public boolean isMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCooking() {
		return cooking;
	}
	public void setCooking(String cooking) {
		this.cooking = cooking;
	}
	
	
	

}
