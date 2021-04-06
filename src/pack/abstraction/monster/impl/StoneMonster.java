package pack.abstraction.monster.impl;

import pack.abstraction.monster.Monster;

/**
 * Core Java - Exercise - OOP - Creating a Monster 
 * @author John Fink
 *
 */
public class StoneMonster extends Monster {

	public StoneMonster(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String attack() {
		return "Attack with stones!";
	}

}
