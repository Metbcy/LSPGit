package org.howard.edu.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.net.URL;
import java.util.HashMap;

public class Hw2 {
	public String readToString(String resource) throws FileNotFoundException {
        URL url = getClass().getClassLoader().getResource(resource);
        
        System.out.println(url.getPath());
        
        if (url != null) {
			File file = new File(url.getPath());
			
			Scanner scanner = null;
			
	        try {
	        	scanner = new Scanner(file);
				HashMap<String, Integer> wordFrequency = new HashMap<>();
	            while (scanner.hasNextLine()) {
	                String[] words = scanner.nextLine().split(" ");
	                for (String word : words) {
	                    word = word.replace(".", "");
	                    if (word.isEmpty()) {
	                        continue;
	                    }
	                    word = word.toLowerCase();
	                    if (word.length() <= 3) {
	                        continue;
	                    }
	                    
	                    if (!word.matches("[0-9]+")) {
	                        if (wordFrequency.containsKey(word)) {
	                            wordFrequency.put(word, wordFrequency.get(word) + 1);
	                        } else {
	                            wordFrequency.put(word, 1);
	                        }
	                    }
	                }
	            }
	            System.out.println(wordFrequency);
	        } finally {
	        	scanner.close();
	        }
	    }
	        throw new FileNotFoundException();
	}
	}
