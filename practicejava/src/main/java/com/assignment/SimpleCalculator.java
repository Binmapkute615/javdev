/* Assignment 2: JavaSE application to make a Simple Calculator using switch...case
should be able to add, subtract, multiply and divide two numbers. 
Scan the two numbers and operator using Scanner class.
*/
package com.assignment;

import java.util.Scanner;

public class SimpleCalculator {
		char operator;
		double num1, num2, result;
		
	public static void main(String[] args) {
		SimpleCalculator object = new SimpleCalculator();
		object.scanner();
		object.Operator();
		//object.printedbill();
	}
	
	  void scanner() { 
		  Scanner input = new Scanner(System.in); // create an object of Scanner class
		  System.out.print("Choose an operator: +, -, *, or /: "); // ask users to enter operator
		  operator = input.next().charAt(0);
		  System.out.print("Enter first number: "); // ask users to enter number
		  num1 = input.nextDouble();
		  System.out.print("Enter second number: ");
		  num2 = input.nextDouble();
		  input.close(); //close the input scanner  
	  }
	  
	void Operator() {
	    switch (operator) {
	    case '+':// performs addition between numbers
	    	result = num1 + num2;
	        System.out.print("The Result of: ");
	        System.out.print(num1 + " + " + num2 + " = " + result);
	        break;
	    case '-':// performs subtraction between numbers
	        result = num1 - num2;
	        System.out.println("The Result of: ");
	        System.out.print(num1 + " - " + num2 + " = " + result);
	        break;
	    case '*': // performs multiplication between numbers
	        result = num1 * num2;
	        System.out.print("The Result of: ");
	        System.out.print(num1 + " * " + num2 + " = " + result);
	        break;
	    case '/':// performs division between numbers
	        result = num1 / num2;
	        System.out.print("The Result of: ");
	        System.out.print(num1 + " / " + num2 + " = " + result);
	        break;
	    default:
	        System.out.print("Invalid operator!");
	        break;
	    }
	}	
}