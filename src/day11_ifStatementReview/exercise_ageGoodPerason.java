package day11_ifStatementReview;

public class exercise_ageGoodPerason {


public static void main(String[] args) {
	
	
	
	 /*
    
    declare an int variable called Age
    declare a boolean variable "GoodPerson"
    
    if good person is false:
            age >= 18 => cigra
            age >= 21 => Hookah
            age >= 25 => alcohol
            
            age < 18  => milk
            
   else 
   // bad for your health
    
    
    
    
    */
int age =21;
boolean GoodPerson = false;
   
if( age >= 18) {

   if(GoodPerson) {
       System.out.println("Alcohol is bad for your health");
   }
   else { // GoodPerson=false, && age >=18
       
       System.out.println("You can buy Cigrates");
       if(age>=21) {
           System.out.println("You can buy Hookah");
       }
       if(age >= 25) {
           System.out.println("You can buy Alcohol");
       }
       
   }
   
   
}else { // age<18
   System.out.println("buy milk");
   
   
   /*
    1. write a program that can find number of days in a month
    	(assume tahat feb has 28 days)
    	
    int month= 0~12;
  
    
    1          2         3       4       5         6        7       8       9       10      11     12
    Jan,     Feb,   Mar,   Apr,   May,  Jun,   Jul,   Aug,  Sep,.   Oct,  Nov,   Dec
    31       28     31       30      31    30      31    31    30      31      30     31
    
    
    
    MUST USE NESTED IF
    
    
    
    28 days : 2
    30 days:  4, 6, 9, 11
    31 days:  1, 3, 5, 7, 8, 10, 12
   
    
   even number of 30 days: 4 &6
            odd number of 30 days: 9 & 11
             
            even number of 31 days: 8, 10, 12
            odd number of 31 days: 1,3,5, 7 
    
    
    */
   
   int month = 5;  
   if( month >0 && month < 13) {
       if(month==1) {
           System.out.println("31 days ");
       }
       else if(month==2) {
           System.out.println("28 days");
       }
       else if(month==3){
           System.out.println("31 days");
       }
       else if(month == 4) {
           System.out.println("30 days");
       }
       else if( month ==5 ) {
           System.out.println("31 days");
       }
       else if(month == 6) {
           System.out.println("30 days");
       }
       else if(month ==7) {
           System.out.println("31 days");
       }
       else if(month %2 ==0 ) {  
       // months greater than 7, if it's even number ==> 31 days
           System.out.println("31 days");
           
       }else {
 // months greater than 7, if it's odd number ==> 30 days
           System.out.println("30 days");
       }
       
     }
        else {
        System.out.println("Invalid Entry");
   }
   
   
   System.out.println("=================================");
   
   /*
   
   28 days: 2
   30 days: 4,6, 9, 11
   31 days: 1,3,5,7,8,10,12
   
   Leap year:
       29 days: 2
   
   
*/
   
   

   int month2 = 13;
   int year = 2000;
   if(month2>0 && month2 <13) {  //  1~12
       
           if(month2 ==2 ) { // month2=2
               if(year%4 == 0) { // condition for leap year
                   System.out.println("29 days");
               } 
               else { // condition for regular year
                   System.out.println("28 days");
               }
           }
           
           else if( month2== 4 || month2==6 ) { // month2=4 or month2=6
               
               System.out.println("30 days");
               
           } else if ( month2==9 || month2==11) { // month2=9 or month2=11
               System.out.println("30 days");
               
           } else { //  month2 : 1,3,5,7,8,10,12
               System.out.println("31 days");
           }
   
   } 
   
   else {
       
       System.out.println("Invalid Entry"); 

   
}
   
// if-else   &&  else-if:
   
   
   if(true) {  // true
       System.out.println("hello");
   }
   else {  // false
       System.out.println("Batch 12");
   }
   
   
   if(true) { // true
       System.out.println("hello");
   }
   else if (false) { // false
       System.out.println("Batch 12");
   }
   else {  // NEVER GETS EXECUTED
       System.out.println("Cybertek");
   }
   
   
   
   
    if(true) {
    
    }
    else {
    
    }
//   else if(false){  }   
    // else-if MUSt be declared right after the if block
    
    
    int X =10;
    
    if(X > 0) {
        System.out.println("greater than 0");
    }
    
     if (X >5) {
        System.out.println("Greater than 5");
    }
     
    if ( X ==10) {
        System.out.println("equal to 10");
    }
    
    
    
    if(X > 0) {
        System.out.println("greater than 0");
    }
    else if (X >5) {
        System.out.println("Greater than 5");
    }
    else if ( X ==10) {
        System.out.println("equal to 10");
    }
    
    
    
   
   
   if(true) {
       
   }   // only be used for 1 condition
   
   
   
   if(true) {     // for 2 condition
       
   }
   else {
       
   }
   
   
   
   if(true) {    // fot more than two
       
   }else if(true) {
       
   }else if(true) {
       
   }else {
       
   }
   
   
   if( true ) {  // if the condition has multiple scenarios
                //  if we have pre condition
       
       if(true) {  
           // execution of this block depends on the first condition
           
       }
   }
   
   
} 
 
}

}

       
       
   


	

