package chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("type string 1");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println("type string 2");
		String t = scan.nextLine();
		scan.close();

		System.out.println(Question2.comparestrings2(s, t));
	}

	static boolean comparestrings(String s, String t) {

		char[] string1array = s.toCharArray();
		char[] string2array = t.toCharArray();

		Arrays.sort(string1array);
		Arrays.sort(string2array);

		if (Arrays.equals(string1array,string2array)) {

			return true;
		} else {
			return false;
		}
	}
	
	static boolean comparestrings2(String s, String t) {

		char[] string1array = s.toCharArray();
		char[] string2array = t.toCharArray();

		int [] letters = new int[128];
		for(char c : string1array){
			letters[c] +=1;
		}
		
		for(char c : string2array){
			letters[c]-= 1;
			if(letters[c] < 0){
				return false;
			}
		}
		
		return true;
	}

}
