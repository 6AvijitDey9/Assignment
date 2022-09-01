package com.cognizant.shapes; //Given package name according to the question

class Rectangle { //Develop the first class named "Rectangle"
	void calculateArea() { //Develop a method named "calculateArea()"
		System.out.println("The Area of the rectangle is calculated using the formula length * breadth"); //Print statement 
	}
}

public class AreaCalculator { //Develop another class named "AreaCalculator"

	public static void main(String[] args) {
		Rectangle shape=new Rectangle(); //Calling the first class to display the message
		shape.calculateArea();
	}

}
