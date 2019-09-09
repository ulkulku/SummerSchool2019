package Replit;

import java.util.*;

public class _05_PrintVariable {
	public static void main(String[] args) {
		// do not change
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME:");
		System.out.println("ENTER YOUR AGE:");

		int age = scan.nextInt();

		String name = scan.next();

		System.out.println("Your age is " + age);
		System.out.println("Your name is " + age);

		// do not change
		
		System.out.println("ENTER two numbers:");
		int first = scan.nextInt();
		int second = scan.nextInt();

		// write your code here

		System.out.println("first is " + first + " second = " + second);

	}
}