package day07_Uneray_SHorthand;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		
		/*
		 +: positive
		 -: negative
		 ++: increment
		 --: decrement
				 
	 
		 */
		
		int a = 10;
		int b =-10;
		System.out.println(b); // -10
		
		// increment:
		// a. pre increment: operator is placed before the ariable;
		
		int num1 = 100;
		
		
		//System.out.println(num1); //101
		System.out.println(++num1); //101
		
		int num2 = ++num1;
		System.out.println(num2); //102
		
		
		// post increments: operator is places after the variable
		
		int IntNum = 100;
		System.out.println(++IntNum); // 101
		System.out.println(IntNum ++);  //100
		
		
		int IntNum2 = IntNum ++; // IntNum2 = 101
		
		System.out.println(IntNum2);
		
		System.out.println(IntNum); //102
		
		
		int x = 100;
		int y = x++ - 1;
		
		System.out.println(y); // 99
		
		
		int P = 50;// 49 - 50 - 49 
		P = --P  +  P++  +  P--  +  P++;
		
		//   49 +  49  +  50  + 49
		
		System.out.println(P); // 197
		
		
		
	}

}
