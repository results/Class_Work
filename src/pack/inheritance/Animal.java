package pack.inheritance;

public class Animal extends LivingThing{
	
	public Animal(String name, String type, double height, double weight, double lifespan, boolean legalpet) {
		this.name = name;
		this.type = type;
		this.lifespan = lifespan;
		this.legalpet = legalpet;
	}
	
	public Animal() {
		super();
	}

	protected String name;
	protected String type;
	protected double lifespan;
	protected boolean legalpet;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public double getLifespan() {
		return lifespan;
	}
	public void setLifespan(double lifespan) {
		this.lifespan = lifespan;
	}
	public boolean isLegalpet() {
		return legalpet;
	}
	public void setLegalpet(boolean legalpet) {
		this.legalpet = legalpet;
	}

	
	
}
