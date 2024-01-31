package com.java.pack2;
import java.util.HashMap;
import java.util.Map;

public class Map3 {
	

	    public static void main(String[] args) {
	        // Creating a HashMap
	        Map<String, Integer> studentScores = new HashMap<>();

	        // Adding key-value pairs to the map
	        studentScores.put("Alice", 90);
	        studentScores.put("Bob", 85);
	        studentScores.put("Charlie", 95);
	        studentScores.put("David", 88);

	        // Accessing values using keys
	        System.out.println("Bob's score: " + studentScores.get("Bob"));

	        // Iterating over the map
	        System.out.println("Student scores:");
	        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Checking if a key exists
	        String studentName = "Alice";
	        if (studentScores.containsKey(studentName)) {
	            System.out.println(studentName + "'s score: " + studentScores.get(studentName));
	        } else {
	            System.out.println(studentName + " not found in the map.");
	        }
	    }
	}



