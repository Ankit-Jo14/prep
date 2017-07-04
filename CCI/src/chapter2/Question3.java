package chapter2;

public class Question3 {
 public static void main (String args []){
	 double num;
	 long iPart;
	 double fPart;

	 // Get user input
	 
	 num = -2.2;
	 iPart = (long) num;
	 fPart = num - iPart;
	 System.out.println("Integer part = " + iPart);
	 System.out.println("Fractional part = " + fPart);
	 
	 double d = 1234.56;
	 long x = Math.round(d);
	 System.out.println("round " + x);
 }
}
