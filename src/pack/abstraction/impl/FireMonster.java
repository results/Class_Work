package pack.abstraction.impl;

import pack.abstraction.Monster;

/**
 * Core Java - Exercise - OOP - Creating a Monster 
 * @author John Fink
 *
 */
public class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String attack() {
		return "Attack with fire!";
	}

}
