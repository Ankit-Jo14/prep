package chapter5;

public class Question6 {
	public static void main(String[] args) {
		int a = 16;
		int b = a - 1;
		printBit(a & b);
		
		printBit(bitSwaprequired2(15, 16));
		int i = 20;
		while (i != 0) {
			// printBit(i);
			i = i & (i - 1);
			// printBit(i);
		}
	}

	static int bitSwaprequired(int a, int b) {
		printBit(a);
		printBit(b);
		int c = a ^ b;
		printBit(-1);
		printBit((c - 1));
		printBit((c & (c - 1)));
		printBit(-1);

		printBit(c);
		int count = 0;
		while (c != 0) {
			if ((c & 1) == 1) {
				count++;
			}
			c >>= 1;
		}
		return count;
	}

	static int bitSwaprequired2(int a, int b) {

		int count = 0;
		
		for (int c = a ^ b; c != 0; c = c & (c - 1)) {
			printBit(c);
			count++;
		}
		return count;
	}

	public static void printBit(int i) {
		System.out.println(i + " : " + Integer.toBinaryString(i));
	}
}
