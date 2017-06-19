package chapter2;

public class Question2 {

	public static void main(String[] args) {
     System.out.println(Question2.binaryString(0.125));
	}

	static String binaryString(double num) {
		if (1 <= num && num <= 0) {
			return "error";
		}
		StringBuilder s = new StringBuilder('.');
		while(num > 0)
		{if (s.length() < 32) {
			double r = num * 2;
			if (r >= 1) {
				s.append('1');
				num = r - 1;
			} else {
				s.append('0');
				num=r;
				
			}
		} else {
			return "length";
		}
		System.out.println(num);
		}
		return s.toString();
	}
}
