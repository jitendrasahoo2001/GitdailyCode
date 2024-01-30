package com.java.pack1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exce2 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.println("Enter the starting of the range:");
	            int start = scanner.nextInt();

	            System.out.println("Enter the ending of the range:");
	            int end = scanner.nextInt();

	            if (start < 0 || end < 0 || start > end) {
	                throw new IllegalArgumentException("Invalid range. Both start and end must be non-negative, and start should be less than or equal to end.");
	            }

	            long result = calculatePrimeSum(start, end);
	            System.out.println("Sum of prime numbers between " + start + " and " + end + " is: " + result);
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter valid integers.");
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

	    public static long calculatePrimeSum(int start, int end) {
	        long sum = 0;

	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                sum += i;
	            }
	        }

	        return sum;
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}



