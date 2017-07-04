package chapter2;

public class Question1 {

	public static void main(String[] args) {
       Question1.mergebinary(21, 5, 1, 3);
     //  System.out.println(" binary ->" + Integer.toBinaryString(1<<5));
     //  System.out.println(" binary ->" + Long.toBinaryString(Double.doubleToRawLongBits(0.625)));
	}

  static int mergebinary(int N , int M , int i , int j){
	  System.out.println(" binary ->" + Integer.toBinaryString(N));
	  int left = ~0 << j+1;
	  System.out.println(" binary ->" + Integer.toBinaryString(left));
	  int right = (1 << i)- 1;
	  System.out.println(" binary ->" + Integer.toBinaryString((right)));
	  int mask = left | right ;
	  System.out.println(" binary ->" + Integer.toBinaryString(mask));
	  int masked_N = N & mask;
	  System.out.println(" binary ->" + Integer.toBinaryString(masked_N));
	  int shift_M = M << i;
	  System.out.println(" binary ->" + Integer.toBinaryString(shift_M));
	  int answer = masked_N | shift_M;
	  System.out.println(" binary ->" + Integer.toBinaryString(answer));
	  return answer;
  } 	

}
