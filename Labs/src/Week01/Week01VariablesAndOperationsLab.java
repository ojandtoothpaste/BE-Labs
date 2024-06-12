//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight	
		int availablePlaneSeats = 8;

		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 89.78;

		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'A';

	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;

		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Gabe";

		
		// 6. Create a variable to hold a street address
		String streetAddress = "1234 S Easy St";
		
		

		// 7. Print all variables to the console
		System.out.println("Available Seats " + availablePlaneSeats);
		System.out.println(costOfGroceries + " is the price for groceries");
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(streetAddress);
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		//availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
	

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		 		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		 		System.out.println(costOfGroceries);


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'C';  	
				System.out.println(middleInitial);
		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside =! isHotOutside;
		System.out.println(isHotOutside);


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Swenson";
		System.out.println(fullName);
	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hi my name is " + fullName + " and I live at " + streetAddress);

		
		
	}
}