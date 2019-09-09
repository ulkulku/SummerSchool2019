package day06_ArithmaticOperators;

public class PrimitivesCasting {
	
	/*
	 casting: converting larger primitive to smaller size
	 			datatype variable name = value
	 			 
	 			casting : explicit & implicit
	 primitives: byte, short, int, long, float, double
	 */

	
	public static void main(String[] args) {
		
		int a = 100;
		byte b = (byte) a;  // explicit casting
		System.out.println("B: " +b);		//b
		
		double DecimalNumber = 10.5;
		float FloatNumber = (float)DecimalNumber;
			// FloatNumber = 10;
		
		System.out.println("Float number: "+ FloatNumber); // 10.5
		
		System.out.println("\n===============\n");
		
		long LongNum = 300L;
		int IntNum = (int) LongNum; 
		System.out.println("Long to int: "+IntNum);
		byte byteNum = (byte) LongNum;  
		System.out.println("Long to byte: "+byteNum);
		short shortNum = (short) LongNum;
		System.out.println("Long to short: "+shortNum);
		
//		System.out.println(IntNum); // 300
		
//  implicit casting: 
		
		byte ByteNum = 100;
		int intNum2 = ByteNum;
			// same with:
		int IntNum3 = (int) ByteNum;
		
		
		short ShortNum = 100;
		
		long  LongNum2 = ShortNum; //implicit
			//  same with:
		long LongNum3 = (long) ShortNum;
		
	// explicit casting practitec:
		
		double LargestNumber = 100.8765;
		 //byte ByteValue = (byte) LargestNum;
				
		
		
		/*
		 int num1 =100
		 int num2 =200
		 int num3 =300
		 */
		
		//int num1 = 100 , num2 = 200 , num3 = 300;
		
		//boolean result1 , result2 , result3;
		
		
		
	}
}
