package day13_Review;

public class switchStatements {
	

	  /*
    
    switch(Expression){
           case caseValue:
                       statements;
                       break;
           
           default:
                   statements;
                   break;
    
    }
    
    */
   
   public static void main(String[] args) {
       
       int num = 5;
       
       switch( num ) {     
           case 7 :
               System.out.println("Sunday");
               break;  // case closed/dismissied
//it's used for exiting switch statement after the case is executed
       
           default:
               System.out.println("Invalid Entry");
               System.out.println("Invalid");
               break; // exits the switch statement
       //  System.out.println("Wednesday");  
//break statement means the closing statement, cannot give any more statements after the break
               
           case 5:
               System.out.println("Friday");
               break;      
       }
       
       
       String days ="Monday";
       
       switch ( days ) {
           default:
               System.out.println("Invalid");
               
           case "Monday": 
               System.out.println("Monday is fun day");  
               
           case "Tuesday":
               System.out.println("Tuesday is great day");   
               break;
       //      break;
               
           case "Wednesday":
               System.out.println("Wednesday is day off");                               
       }
       
       // break till:  4: 12 pm
       
       
       
           
   }
}
