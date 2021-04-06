package pack.inheritance;

public class Dog extends Animal {
	
	
	
	public Dog(String name, String type, double height, double weight, double lifespan, boolean legalpet,
			String dogType, String dogownerName, String size) {
		super(name, type, height, weight, lifespan, legalpet);
		this.dogType = dogType;
		this.dogownerName = dogownerName;
		this.size = size;
	}
	
	public Dog(String owner) {
		super();
		this.dogownerName = owner;
	}
	
	private String dogType;
	private String dogownerName;
	private String size;
	
	public String getDogType() {
		return dogType;
	}

	public void setDogType(String dogType) {
		this.dogType = dogType;
	}

	public String getDogownerName() {
		return dogownerName;
	}

	public void setDogownerName(String dogownerName) {
		this.dogownerName = dogownerName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
