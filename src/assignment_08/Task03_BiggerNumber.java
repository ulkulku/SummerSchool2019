package assignment_08;

public class Task03_BiggerNumber {

	public static void main(String[] args) {
		
		int n1= 101;
		int n2= 28;
		int n3= 110;
		int max;
	
		if (n1>n2 && n1>n3) {
//			System.out.println( n1 +" is biggest");
			max = n1;
			System.out.println("Max: " + max);
		}	
		if (n2>n1 && n2>n3) {		
//			System.out.println(n2 +" is biggest");
			max = n2;
			System.out.println("Max: " + max);
		}	
		if ((n3>n1 )&& (n3>n2)) {
//			System.out.println(n3 + " is biggest");
			max = n3;
			System.out.println("Max: " + max);
			
		}
		 
		
		System.out.println("===========MUHTARS  SOLUTION===============");
		
		
		// solution 1:
	    int N1=1000, N2= 5000, N3 = 900;    
	    
	    int maximum = 0;  // local variable must be initialized before use
	    
	    /* 
	     in order to n1 be the maximum :  n1 > n2 && n1 > n3
	     in order to n2 be the maximum :  n2 > n1 && n2 > n3
	     in order to n3 be the maximum :  n3 > n1 && n3 > n2
	    
	    */
	    
	    if ( N1 > N2 && N1 > N3 ) {
	        maximum = N1;
	    }
	    
	    if(N2 > N1 && N2 > N3) {
	        maximum = N2;
	    }
	    
	    if(N3 > N1 && N3 > N2 ) {
	        maximum = N3;
	    }
	    
	    System.out.println(maximum); 
	    // 5000
		
		
		
		
		
		
		
		
		
		
	}

}
