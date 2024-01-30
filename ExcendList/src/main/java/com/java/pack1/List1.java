package com.java.pack1;

import java.util.*;
public class List1 {
	public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String word:strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String srtdch = new String(chars);

            if(!map.containsKey(srtdch)){
                map.put(srtdch,new ArrayList<>());
            }
            map.get(srtdch).add(word);
        }
        return new ArrayList<>(map.values());
        
        
    }
	 public static void main(String[] args) throws Exception {
	        Scanner scanner = new Scanner(System.in);
	        List1 listr = new List1();

	        System.out.println("Enter words separated by spaces to group anagrams:");
	        String input = scanner.nextLine();
	        String[] words = input.split("\\s+");

	        List<List<String>> result = listr.groupAnagrams(words);

	        for (List<String> group : result) {
	            System.out.println(group);
	        }

	    }

}
