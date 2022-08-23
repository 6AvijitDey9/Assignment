package Assignment;

//Q.1 WAJP to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class PossitiveorNegative {

	public static void main(String[] args) {
	Scanner av= new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int number =  av.nextInt();//Taking the input from user
	
	//using Decision making conditions to check the number is positive or negative
	if(number>0)
		System.out.println("You have entered a possitive number");
	else if(number<0)
		System.out.println("You have entered a negative number");//Print statement
	else
		System.out.println("You have entered Zero");
	}

}
