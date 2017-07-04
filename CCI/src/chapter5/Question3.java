package chapter5;

public class Question3 {

	public static void main(String[] args) {
		int num = 20;
		System.out.println( "binary : " + Integer.toBinaryString(20)+ " length "+ Question3.flipbit(num));

	}
	
	public static int flipbit(int num){
		int previousLength=0 , currentLength =0, maxLength = 1;
		
		while(num > 0){
			if((num & 1) == 1){
				currentLength++;
				
			}else{
				previousLength = (num & 2)== 0 ? 0 : currentLength;
				currentLength = 0;
			}
			maxLength = Math.max(currentLength + previousLength +1, maxLength);
			num >>>= 1;
		}
		
		return maxLength;
	}

}
