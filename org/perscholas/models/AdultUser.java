package org.perscholas.models;

public class AdultUser implements LibraryUser {
	int age ;
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

	String bookType ;

	@Override
	public void registerAccount() {
		if (age >=12 ) {
			System.out.println("“You have successfully registered under an Adult Account”");
		}
		else if (age <=11){
	System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
		
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}

}
