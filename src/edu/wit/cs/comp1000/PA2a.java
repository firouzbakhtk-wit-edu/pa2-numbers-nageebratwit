package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
	    Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sumPositive = 0, sumNonPositive = 0, sumAll = 0;
        int countPositive = 0, countNonPositive = 0;

        System.out.printf("Enter five whole numbers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sumAll += numbers[i];
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
                countPositive++;
            } else {
                sumNonPositive += numbers[i];
                countNonPositive++;
            }
        }

        double avgPositive = countPositive > 0 ? (double) sumPositive / countPositive : 0;
        double avgNonPositive = countNonPositive > 0 ? (double) sumNonPositive / countNonPositive : 0;
        double avgAll = (double) sumAll / 5;
        
        if (countPositive == 1) {
            System.out.printf("The sum of the %d positive number: %d%n" , countPositive, sumPositive);
        } else {
        	System.out.printf("The sum of the %d positive numbers: %d%n" , countPositive, sumPositive);
        }
        
        if (countNonPositive == 1) {
        	System.out.printf("The sum of the %d non-positive number: %d%n" ,countNonPositive , sumNonPositive);
        } else {
        	System.out.printf("The sum of the %d non-positive numbers: %d%n" ,countNonPositive , sumNonPositive);
        }
        
        System.out.printf("The sum of the 5 numbers: %d%n" , sumAll);
        
        
        if (countPositive == 1) {
        	System.out.printf("The average of the %d positive number: %.2f%n", countPositive , avgPositive);
        } else {
        	System.out.printf("The average of the %d positive numbers: %.2f%n", countPositive , avgPositive);
        }		
        	
        if (countNonPositive == 1) {
        	System.out.printf("The average of the %d non-positive number: %.2f%n", countNonPositive , avgNonPositive);
        	} else {
        System.out.printf("The average of the %d non-positive numbers: %.2f%n", countNonPositive , avgNonPositive);
        	}
        
        System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
    }
}
