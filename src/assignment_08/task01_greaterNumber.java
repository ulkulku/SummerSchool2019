package assignment_08;

public class task01_greaterNumber {

	public static void main(String[] args) {
		
		// Task01:
        int num1=500;
        int num2=100;
        
        int max = 0; // local variables needs to be initialized before use
        
        if( num1 > num2 ) {  // means that num1 is greater than num2
            // false
            // max = num1;
            max += num1;
        }
        
        if( num2 > num1 ) {  
            // true
            
            // max = num2;  // max=300;
             max += num2;
        }
        
        if( num1 == num2 ) {
        //  max = num2;
            max += num2;
            System.out.println("both numbers are equal");
        }
        
        
    System.out.println("Maximum number between "+num1 +" and "+num2+" is "+max);

	
			
			
		}
		
		
		
		
		
	}

