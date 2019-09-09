package day03_variables;

public class PrimitiveDataTypes {
	/* 
	 byte : we can assign numbers. must be with in -128 <=  byte <= 127
	 short : we can only assigner whole number. must be with in -32768 <= short <=32767
	 int : (used more often) we can only assign whole number. 
	 long : we can only assign whole number. at the end of value we can 
	 
	 byte < short < int < long
	 small one can be assigned larger one
	 
	 the variables dataType must be larger in order to contain
	 
	 
	 float: we can assign decimals (decimals must have f or F letter
	 
	 double : we can assign decimals. used more ofen. float , double)
	 
	 
	 */
	
	
public static void main(String[] args) {
	
	byte length = 3;
	System.out.println(length);
	
	byte width = 4;
	System.out.println(width);
	
	// byte 9num=100 variables must starts  with alphabets a-z, A-Z
	
	byte num_and$ = 90;
	
	
	// byte length =6; variable name must be unique
	
	// byte  public =6  variables names cannot be java reserved words
	
	// byte mynum1 = -129: out of byte range
	
	byte variableName = 127;
	
	// short num2 =100;  we can only assign whole numbers
	
	// short num3 = 100000; out of range
	
	int num4 = -100000000;
	
	// 100,000,000
	
	int num5 = 1_000_000_000; // easier to read, (just like , in accounting)
	
	
	long longNumber =10l;
	
	int intNumber =10;
	
	byte byteNumber =10;
	short ShortNumber = byteNumber;
	
	short shortNumber2 =18;
	// byte byteNumber2 = shortNumber2;  short is greater than byte
	
	int intNumber1 = -19245;
	long longNumber2 = intNumber; // long is greater than int
	// left side of the = has to be equal or greater than the rigth side
	
	short shortNumber3 = -30000;
	short shortNumber4 = shortNumber3;
	
	System.out.println(shortNumber4);
	
 // int examplme Num1 = 10.5;
	float exampleNum2 = 10.5F;
	float exampleNum3 = 20.5f;
	
	double doubleNumber = 10.5;
	
	double dNumber2 = 30.5;
	
	// float floatNumber = dubleNumber2; double datatypes is larger than float data type
	
	byte bNum = 10;
	short sNum = 20;
	int iNum = 30;
	long lNum = 40;
	System.out.println(bNum);
	System.out.println(sNum);
	System.out.println(iNum);
	System.out.println(lNum);
	
	System.out.println("=============================");
	
	float fNum = bNum;
	float fNum2 = sNum;
	float fNum3 = iNum;
	float fNum4 = lNum;
	
	System.out.println(fNum);
	System.out.println(fNum2);
	System.out.println(fNum3);
	System.out.println(fNum4); 
	
	System.out.println("==========================");
	double dNum = bNum;
	double dNum2 = sNum;
	double dNum3 = iNum;
	double dNum4 = lNum;
	
	System.out.println(dNum);
	System.out.println(dNum2);
	System.out.println(dNum3);
	System.out.println(dNum4);
	
	
	
	
}
}
