/* Assignment 4: Print the following pattern
1
212
32123
4321234
543212345
 */

package com.assignment;

import java.util.Scanner;

public class ProgramPatternNumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n values: ");
		n = input.nextInt();
		input.close();
		//int a;  
		//a = n;
		
		for(int i=1; i<=n; i++) {
			// for(int j=a; j>1; j--) { System.out.print(" "); }
			for(int k = i; k!=0; k--) {
				System.out.print(k);
			}
			//a--;
			for(int l = 2; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
