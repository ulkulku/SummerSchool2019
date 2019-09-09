package assignment_08;

public class swapvariable {
	
	public static void main(String[] args) {
		int a = 10;   // a=b
		int b = 15;   //
		
		a = (a+b) - (b=a);
		System.out.println("A(15): " + a);
		System.out.println("B(10): " + b);

		a+= b - (b=a);
		System.out.println("A(10): " + a);
		System.out.println("B(15): " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("A(15): " + a);
		System.out.println("B(10): " + b);
		
		
		   
		if(a < b ) {
			System.out.println("A great");
		}
		
		
		
		
	}

}
