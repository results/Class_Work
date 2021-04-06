package pack.inheritance;

public abstract class LivingThing {
	
	
	
	public LivingThing() {
		//super();
	}
	
	public LivingThing(String eat, int height, String walk, int age, boolean canSee, String communicate, boolean feeling, int legs) {
		this.eat = eat;
		this.height = height;
		this.walk = walk;
		this.age = age;
		this.canSee = canSee;
		this.communicate = communicate;
		this.feeling = feeling;
		this.legs = legs;
	}

	protected String eat;
	protected int height;
	protected String walk;
	protected int age;
	protected boolean canSee;
	protected String communicate;
	protected boolean feeling;
	protected int legs;
	
	
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getWalk() {
		return walk;
	}
	public void setWalk(String walk) {
		this.walk = walk;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isCanSee() {
		return canSee;
	}
	public void setCanSee(boolean canSee) {
		this.canSee = canSee;
	}
	public String getCommunicate() {
		return communicate;
	}
	public void setCommunicate(String communicate) {
		this.communicate = communicate;
	}
	public boolean isFeeling() {
		return feeling;
	}
	public void setFeeling(boolean feeling) {
		this.feeling = feeling;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}

}
