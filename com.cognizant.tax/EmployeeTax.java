package com.cognizant.tax;
public class EmployeeTax {
	public static void main(String[] args) { //Main Method
		TaxCalculator TC=new TaxCalculator(); //Calling TaxCalculator class 
		TC.calculateTax(25000); TC.deductTax(25000); TC.validateSalary(25000); //Calling methods of TaxCalculator class
		TC.calculateTax(125000);TC.deductTax(125000); TC.validateSalary(125000); //Calling methods of TaxCalculator class
	}}
