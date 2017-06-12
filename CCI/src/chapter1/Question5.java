package chapter1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("type string 1");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println("type string 2");
		String t = scan.nextLine();
		scan.close();

		Boolean output = Question5.compareString(s, t);
		System.out.println("output : " + output);

	}

	static Boolean compareString(String first, String second) {
		char[] bigger = first.length() >= second.length() ? first.toCharArray() : second.toCharArray();
		char[] shorter = first.length() <= second.length() ? first.toCharArray() : second.toCharArray();
		if (bigger.length - shorter.length == 1) {
			int indexShorter = 0, indexBigger = 0;
			Boolean foundDifference = false;
			while (indexShorter < shorter.length) {
				if (bigger[indexBigger] != shorter[indexShorter]) {
					if (foundDifference) {
						return false;
					} else {
						indexBigger += 1;
						foundDifference = true; 
					}
				} else {
					indexShorter += 1;
					indexBigger += 1;
				}      
			}
			return true;
		} else if (bigger.length == shorter.length) {
			int index = 0;
			Boolean foundDifference = false;
			while (index < bigger.length) {
				if (bigger[index] != shorter[index]) {
					if (foundDifference) {
						return false;
					} else {
						index += 1;
						foundDifference = true;
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
