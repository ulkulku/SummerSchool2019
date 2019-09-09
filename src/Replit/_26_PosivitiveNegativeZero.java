package Replit;

import java.util.Scanner;

public class _26_PosivitiveNegativeZero {
	public static void main(String[] args) {
//		    Scanner s = new Scanner(System.in);
//		    int num = s.nextInt();

		// your code here
		int nmm = 0;

		
		if (nmm > 0) {
			System.out.println("positive");
		} else if(nmm<0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");			
		}

		
		System.out.println(nmm>0?"positive":    nmm<0 ? "negative" : "zero"          );
		
		
		
		
		
	}

}
