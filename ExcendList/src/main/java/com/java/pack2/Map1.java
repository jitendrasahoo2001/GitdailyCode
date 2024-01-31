package com.java.pack2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Map1 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        String[] words = sentence.split("\\s+");

	        Map<String, Integer> wordFrequency = new HashMap<>();
	        for (String word : words) {
	            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
	        }

	        System.out.println("Word Frequencies:");
	        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}



