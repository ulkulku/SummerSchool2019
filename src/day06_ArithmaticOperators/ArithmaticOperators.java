package day06_ArithmaticOperators;

public class ArithmaticOperators {
	
	
	/*
	 + : addition, adds two numbers together
	 - : subtraction, subtracts a number from another
	 * : multiplication, multiplies
	 / : devision, devides
	 % : remiander
	 
	 */

	
	public static void main(String[] args) {
		
		int a = 100;
		int b = a - 400; //-300
		
		System.out.println(b);  // -300
		
		int c = a+b; // 100+ -300 - -200
		
		System.out.println(c); // -200
		
		// int X = 3, Y = 5, Z = X * Z; why it is not working for me1
		
		double lenght = 100;
		double Wedith = 10;
		double Area = lenght * Wedith;
		System.out.println(Area); //10
		
		
		
	// % :
		 
		/*
		 20/3 ==> 6 : ( 20 -(6* 3))
		 */
		
		System.out.println(12%5);  //2
		
		/*
		 20, 45, 65, 68
		 
		 even  number: can be devided by 2 without a remainder
		 odd number :  devided by 2 , will have remainder
		 
		 */
		
		int Number20 = 20 % 2; // even
		System.out.println(Number20); // 0
		
		int Number45 = 45 % 2; //1
		System.out.println(Number45); // odd
		
		double percentage=10/100;
        System.out.println(percentage); 
		
		
		
		
	}
	
	
}
