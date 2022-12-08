package org.perscholas;

import org.perscholas.models.AdultUser;
import org.perscholas.models.KidUsers;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUsers kid = new KidUsers ();
		AdultUser adult = new AdultUser();
	System.out.println(" Test case 1A");	
		// if the kid is 10 and want a kids book
		kid.setAge(10);
		kid.registerAccount();
		kid.setBookType("Kids");
		kid.requestBook();
		System.out.println("");
		System.out.println(" Test case 1B");	

		// if the kid is 18 and want a fiction book
		kid.setAge(18);
		kid.registerAccount();
		kid.setBookType("Fiction");
		kid.requestBook();
		
		System.out.println("");
		System.out.println(" Test case 2A");	
		adult.setAge(5);
		adult.registerAccount();
		adult.setBookType("Kids");
		adult.requestBook();

		System.out.println("");
		System.out.println(" Test case 2B");	
		adult.setAge(23);
		adult.registerAccount();
		adult.setBookType("Fiction");
		adult.requestBook();
	
	}

}
