package Assignment;


//Q.3 Take three numbers from the user and print the greatest number.

import java.util.Scanner;
public class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();//Taking the first number from user
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();//Taking the second number from user
		System.out.println("Enter third number: ");
		int n3 = sc.nextInt();//Taking the third number from user
		
		//using Decision making conditions to check the greatest number
		if(n1>n2 && n1>n3)
			System.out.println("The Greatest number is: "+ n1);
		else if(n2>n1 && n2>n3)
			System.out.println("The Greatest number is: "+ n2);//print statement
		else
			System.out.println("The Greatest number is: "+ n3);
	}

}
