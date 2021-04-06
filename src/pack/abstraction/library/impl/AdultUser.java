package pack.abstraction.library.impl;

import pack.abstraction.library.LibraryUser;

/**
 * Core Java - Exercise - OOP - Library Users
 * @author John Fink
 *
 */
public class AdultUser implements LibraryUser {
	
	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}

	private int age;
	private String bookType;

	@Override
	public void registerAccount() {
		if(this.getAge() < 12) {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");		
		} else {
			System.out.println("You have successfully regisered under an Adult Account");	
		}
	}

	@Override
	public void requestBook() {
		if(this.getBookType().equalsIgnoreCase("Fiction")) {
			System.out.println("Book issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
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
