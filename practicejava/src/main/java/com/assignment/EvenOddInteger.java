/* Assigment 3: Java SE code that reads a set of integers, 
 *  and then prints the sum of the even and odd integers separately
 */

package com.assignment;

import java.util.Scanner;

public class EvenOddInteger {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int number;
		int even =0, odd =0; //initialize even and odd number
		char choice;
		
		  do{
	            System.out.print("Enter any number ");
	            
	            number = console.nextInt();
	            if( number % 2 == 0){
	                even += number;
	            }else{
	                odd += number;
	            }
	 
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	 
	        }while(choice=='y' || choice == 'Y');
		  console.close();
		  
		  	System.out.println("Sum of even numbers: " + even);
	        System.out.println("Sum of odd numbers: " + odd);
	}
}