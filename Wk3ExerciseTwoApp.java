package com.wonderwebdev;
import java.util.*;

public class Wk3ExerciseTwoApp {

    public static Integer GetInput() {
        Integer convertedInput = null;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number between 50 - 300");
        String input = scanner.nextLine();
        if(input.isEmpty()) {
            System.out.println("Input cannot be empty. Please enter a number.");
        } else {
            try {
                convertedInput = Integer.parseInt(input);
                if(convertedInput < 50 || convertedInput > 300) {
                    
                    convertedInput = null; // set to null if out of range
                }
            } catch(NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
        return convertedInput;
    }

    public static void main (String[]args) {
        Integer input = GetInput();
        if(input != null) {
            System.out.println("The number you typed in was: " + input);
        }
        else {
        	System.out.println("The number you typed in was: " + input);
        }
    }
}

      
