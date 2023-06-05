package com.wonderwebdev;
import java.util.*;
public class GetInputClass {
	
	public static Integer GetInput() {
        Integer convertedInput = null;
        Scanner scanner  = new Scanner(System.in);
        while (convertedInput == null) {
            System.out.println("Type a number between 50 and 300");
            String input = scanner.nextLine();

            try {
                convertedInput = Integer.parseInt(input);
                if (convertedInput < 50 || convertedInput > 300) {
                    System.out.println("Oops, that number wasn't between 50 and 300, try again:");
                    convertedInput = null; // set to null if out of range
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                convertedInput = null; // set to null if invalid input
            }
        }

        return convertedInput;
    }
}
