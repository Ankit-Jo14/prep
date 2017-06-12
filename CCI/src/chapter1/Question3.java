package chapter1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		System.out.println("get a string");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		scan.close();

		System.out.println(Question3.urlify2(userInput, 12));

	}

	static String urlify(String s) {

		s = s.trim();

		return s.replace(" ", "%20");

	}

	static String urlify2(String s, int trueLength) {
		int spaceCount = 0, index, i = 0;
		char[] str = s.toCharArray();

		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		
			str[index] = '\0';
		

		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
        String r = new String(str);
		return r;

	}
}
