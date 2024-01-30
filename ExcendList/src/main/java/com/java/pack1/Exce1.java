package com.java.pack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter a non-negative integer:");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("Input must be a non-negative integer.");
            }

            long result = calculateFactorial(number);
            System.out.println("Factorial of" + number + " is: " + result);
			
		} catch (InputMismatchException e) {
            System.out.println("Invalid input.Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

	public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
	
}
