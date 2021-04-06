package pack.abstraction.library.impl;

import pack.abstraction.library.LibraryUser;

/**
 * Core Java - Exercise - OOP - Library Users
 * @author John Fink
 *
 */
public class KidUsers implements LibraryUser {
		
	public KidUsers(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	private int age;
	private String bookType;

	@Override
	public void registerAccount() {
		if(this.getAge() < 12) {
			System.out.println("You have successfully registered under a Kids Account");		
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");	
		}
	}

	@Override
	public void requestBook() {
		if(this.getBookType().equalsIgnoreCase("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are only allowed kids books");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	

}
