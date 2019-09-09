package day06_ArithmaticOperators;

public class exercise {
	
	public static void main(String[] args) {
		
	int pies = 10,people = 4;
	double piesPerson;
	piesPerson = pies/people;
	
	System.out.println(piesPerson); //2.0
	
	int pies1 = 10,people1=4; 
	double piesPerson1;
	piesPerson1 = pies/(double)people1;
	
	System.out.println(piesPerson1); //2.5
	
	int pies2 = 10, people2=4;
	double piesPerson2;
	piesPerson2 = (double) pies2/people2;
	
	System.out.println(piesPerson2);//2.5
	
	
//	int pies3 = 10,people3 = 4;
	//double piesPerson3;
//	piesPerson3 = double(pies3/people3); why it takes error
	
	
	
	int num1, num2, sum;	
	num1 = 46;
	num2 = 90;		
	sum = num1 + num2;
	
	System.out.println(sum);
	
	int C, F;
	C = 30;
	F = 9*C/5+9;
	
	System.out.println(F);
	
	
		
	}

}
