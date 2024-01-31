package com.java.pack2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List2 {
	

	    public static void main(String[] args) {
	        List<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        List<Integer> list2 = new ArrayList<>();
	        list2.add(2);
	        list2.add(3);
	        list2.add(4);

	        System.out.println("List 1: " + list1);
	        System.out.println("List 2: " + list2);

	        List<Integer> commonElements = findCommonElements(list1, list2);

	        System.out.println("Common Elements: " + commonElements);
	    }

	    private static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
	        Set<Integer> set1 = new HashSet<>(list1);
	        Set<Integer> set2 = new HashSet<>(list2);

	        set1.retainAll(set2);

	        return new ArrayList<>(set1);
	    }
	}

	


