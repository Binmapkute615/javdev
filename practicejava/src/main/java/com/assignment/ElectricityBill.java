/*Assignment 1:  JavaSE application to generate Electricity bill   (use if-else-if ladder)
inputs are old reading and current reading and generate the bill by following 
slabs/ranges: Scan the inputs using Scanner class
0-50: Rs.1
50-100: Rs2
100-200: Rs.3
200-400: Rs.4
>400: Rs.5
example if the number of units are 120 then 
the consumption charge is (50*1)+(50*2)+(20*3)=Rs.210 
 */

package com.assignment;

import java.util.Scanner; 

public class ElectricityBill {
	String name;
	int units;
	double bill;
	
	public static void main(String[] args) {
		ElectricityBill object = new ElectricityBill();
		object.scanner();
		object.CalculateBill();
		object.printedbill();
	}

	void scanner() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter customer name: ");//print for the same line
		//System.out.println("Enter customer name: ");//println to enter another line
		name = input.nextLine();
		System.out.print("Enter customer units: ");
		units = input.nextInt();
		input.close();//close the in scanner
	}
	
	void CalculateBill() {
		if(units <=50) {
			bill = 1*units;
		}else if(units >50 && units <=100) { // next 50 units
			bill = 1*50 + 2*(units - 50);
		}else if(units >100 && units <= 200) {// next 100 units
			bill =  1*50 + 2*50 + 3*(units - 100);
		}else if(units >200 && units <=400) {// next 200 units
			bill =  1*50 + 2*50 + 3*100 + 4*(units - 200);
		}else if(units>400){ //above 400 units
			bill = 1*50 + 2*50 + 3*100+4*200+5*(units - 400);
		}
	}
	
	
	void printedbill() {
		System.out.println(" -----------------------------------------");
		System.out.println("| Customer Name: "+ name);
		System.out.println("| Number of Units Consumed: "+units);
		System.out.println("| Total Bill Amount: $"+bill);
		System.out.println(" -----------------------------------------");

	}

}