package chapter2;

public class Question1 {

	public static void main(String[] args) {
       Question1.getbit(15, 1);
	}

	static int repeatedLogicalShift(int x, int count) {
		for (int i = 0; i < count; i++) {
			x >>>= 1; // Logical shift by 1
		System.out.print(x);
		System.out.println(" binary ->" + Integer.toBinaryString(x));
		}
		
		return x;
	}
	
	static boolean getbit(int num , int bit){
		int k = 1<< bit;
		System.out.println(k);
		
	 int num2 =	num & k;
	 System.out.println(num2);
	 System.out.println(num2 !=0);
	 return true;
		
	}

}
