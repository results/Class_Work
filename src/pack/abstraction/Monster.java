package pack.abstraction;


/**
 * Core Java - Exercise - OOP - Creating a Monster 
 * @author John Fink
 *
 */
public abstract class Monster {
	
	
	protected Monster(String name) {
		this.name = name;
	}
	
	protected String name;

	protected String attack() {
		return "!^_&amp;^$@+%$* I don&#39;t know how to attack!";
	}

}
