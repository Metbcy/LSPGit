package org.howard.edu.assignment2;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {
		Hw2 fr = new Hw2();
		try {
			System.out.println(fr.readToString("main/java/resources/words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
	}
}