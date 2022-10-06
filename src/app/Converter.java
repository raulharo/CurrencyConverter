package app;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		// Two arrays to store currency names and conversion rates
		double[] valArray = new double[] {1.007, 0.880, 144.579, 0.980, 1.358, 1.531, 7.116};
		String[] nameArray = new String[] {"EUR", "GBP", "JPY", "CHF", "CAD", "AUD", "CNY"};
		// Variable to store the index of chosen currency
		int indexVal = 0;
		
		Scanner userIn = new Scanner(System.in);
		
		// Prompt user for currency to convert USD to
		System.out.println("EUR - GBP - JPY - CHF - CAD - AUD - CNY");
		System.out.print("Please enter which currency you would like to convert USD to: ");
		String choice = userIn.nextLine();
		
		// Prompt for amount
		System.out.print("Enter amount in USD to convert to " + choice + ": ");
		int amount = userIn.nextInt();
		
		// Loop through array to find index of choice
		for(int i = 0; i < nameArray.length; i++) {
			if (nameArray[i].equals(choice)) {
				indexVal = i;
				break;
			}
		}
		
		System.out.println(amount + " in USD converted to " + choice + " is " + (amount * valArray[indexVal]));
		
		userIn.close();
	}
}
