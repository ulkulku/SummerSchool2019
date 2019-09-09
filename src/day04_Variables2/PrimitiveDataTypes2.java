package day04_Variables2;

public class PrimitiveDataTypes2 {

	/*
	 
	 boolean: takes either true or false boolean expression
	 
	 char: declared with in the single quote ''; single character only
	 
	 ' '  is must when you give character as value
	 
	 
	 */
	
	public static void main(String[] args) {
		
		// boolean result = Earth is Flat;
		// boolean num1 = 100; boolean only takes true or false results
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3 ;
		
		
		System.out.println(result);  // true
		System.out.println(result2);  // false
		System.out.println(result3);  // true
		
		
		// char :
		
		char char1 ='a';
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n");
		
		
		// char with numbers
		
		char char4 = 67; // only time we use '' for char is when we are declared 
		// prints the character that is correspondig to 67 from ascii
		
		System.out.println(char4);
		
		char char5 = 'C';  // prints the character as it is
		System.out.println(char5);
		
		char char6 = '{';
		System.out.println(char6);
		
		char char7 = 123;
		System.out.println(char7);
		
		// initializing char to other primitives; byte, short, int, long, float, double
		
		char MyChar1 = 'b';
		
		//   variablename   value
		
		int MyInt = 'b';  // the number that represent b is initalized  to the int
		
				
		System.out.println(MyInt);	 // 98	
		
		// byte MyByte = MyChar1; // chars memory is 2 byte, bytes memory is 1 byte
		byte MyByte2= 'b';
		System.out.println(MyByte2);
		
		
		// short ShortNum = MyChar1; // char memory is cuold be bigger than short
		short ShortNum2 = 'b'; // b is corresponding number 98 from ascii table
		System.out.println(ShortNum2);
		
		long LongNum = MyChar1; // longs memory is 8 bytes
		long LongNum2 = 'b';  // 98
		
		System.out.println(LongNum);
		
		float floatNum = MyChar1;
		float floatNum2 = 'b';
		System.out.println(floatNum2); // 98.0
		
		
		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2); //  98.0
				
		// java is case sensitive: 		A does not equal a
				
		char mycharValue = 1071;
		System.out.println(mycharValue);
		
		
	}
}
