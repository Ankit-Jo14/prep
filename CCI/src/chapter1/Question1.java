package chapter1;

import java.util.Scanner;

public class Question1 {
    //// string having unique charters or not.
	public static void main(String[] args) {
		System.out.println("get a string");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();
		scan.close();

		char[] userInputArray = userInput.toCharArray();
		boolean breakFlag = false;
		for (int i = 0; i < userInputArray.length; i++) {

			if (breakFlag) {
				break;
			} else {
				for (int j = 0; j < userInputArray.length; j++) {
					if ((userInputArray[i] == userInputArray[j]) & i != j) {
						System.out.println("not unique");
						breakFlag = true;
						break;
					}

				}
			}
		}
		
		if(!breakFlag){
			System.out.println("unique");
		}

	}

}
