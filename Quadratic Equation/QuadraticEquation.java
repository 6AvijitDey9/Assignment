package Assignment;


//Q.3 WAJP to solve quadratic equation

import java.util.Scanner; 
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner QE = new Scanner(System.in);
		System.out.println("The value of a:");
		double a = QE.nextDouble();//Taking the value of a
		System.out.println("The value of b:");
		double b = QE.nextDouble();//Taking the value of b
		System.out.println("The value of c:");
		double c = QE.nextDouble();//Taking the value of c
		
		//Quadratic equation
		double i = (-b + Math.sqrt(b*b + 4*a*c)) / (2.0 * a);  
		double j = (-b - Math.sqrt(b*b + 4*a*c)) / (2.0 * a);  
		System.out.println("The answer of quadratic qquation is: Root1= " + i + " and Root2= " + j); //print statement
	}

}
