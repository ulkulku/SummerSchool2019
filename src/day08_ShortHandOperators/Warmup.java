package day08_ShortHandOperators;

public class Warmup {
	
	
	/*
	 write a java program that converts gallons to liters
	 1 gallon = 3.785 liters
	 1 liters = 1 / 3.785
	 
	 
	 write a java program that converts liters to gallons
	 1 gallon = 3.785 liters
	 1 liters = 1/3/785
	 
	 
	 */

	public static void main(String[] args) {
		
		
		int gallon = 100;
		double litres = gallon * 3.785; // converts gallon to liters
		String result1 = gallon + "gallons egual to " + litres+ " litres";
		
		System.out.println(result1);
		
		double L = 1;// also can use int for whole number
		double G = L / 3.785;
		
		System.out.println(G); // 0.264200798...
		
		System.out.println( L + " litters egual to " + G + " gallons");
		
		// task1 
		
		int x = 2;
		int y = x++; // y= 2; x= 3
			  //post
		System.out.println(y+ " " + x);
		
		
		int x2 = 2;
		System.out.println(x2++); //2
		System.out.println(x2); //3
		
		int x3= 2;
		System.out.println(--x3); // 2-1 = 1
		
	
				
				
				
				
				
				
		
		
		
	}
	
	
	
	
}
