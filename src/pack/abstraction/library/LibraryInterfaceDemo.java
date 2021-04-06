package pack.abstraction.library;

import pack.abstraction.library.impl.AdultUser;
import pack.abstraction.library.impl.KidUsers;

/**
 * Core Java - Exercise - OOP - Library Users
 * @author John Fink
 *
 */
public class LibraryInterfaceDemo {
	
	public static void main(String[] args) {
		KidUsers kidKyle = new KidUsers(10, "Kids");
		kidKyle.registerAccount();
		kidKyle.requestBook();
		
		KidUsers kidMonsterEnergy = new KidUsers(18, "Fiction");
		kidMonsterEnergy.registerAccount();
		kidMonsterEnergy.requestBook();
		
		AdultUser adultAdam = new AdultUser(5, "Kids");
		adultAdam.registerAccount();
		adultAdam.requestBook();
		
		AdultUser adultKevin = new AdultUser(23, "Fiction");
		adultKevin.registerAccount();
		adultKevin.requestBook();
		
	}
	


}
