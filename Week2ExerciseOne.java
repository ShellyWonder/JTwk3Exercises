package com.wondewebdev;
import java.util.*;

public class Week2ExerciseOne {

	
	public static void main (String[]args) {
//		write the code to collect numeric input from console.
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a number between 50 - 300");
		
		String input = scanner.nextLine();
		if(input.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter a number.");
            return;
        }
		else {
			try {
	            Integer convertedInput = Integer.parseInt(input);

	            if(convertedInput >= 50 && convertedInput <= 300) {
	                System.out.println("You typed in:" + input);
	                System.out.println("Yes!");
	            } else {
	                System.out.println("You typed in:" + input);
	                System.out.println("Please re-enter a number between 50 - 300");
	            }
	        } catch(NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a numeric value.");
	        }
		}
		
   }
}
