package com.java.pack2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List1 {



	    public static void main(String[] args) {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(2);
	        numbers.add(4);
	        numbers.add(1);

	        System.out.println("Original List: " + numbers);
	        removeDuplicates(numbers);
	        System.out.println("List after removing duplicates: " + numbers);
	    }

	    private static void removeDuplicates(List<Integer> list) {
	        Set<Integer> uniqueSet = new HashSet<>(list);
	        list.clear();
	        list.addAll(uniqueSet);
	    }
	}


