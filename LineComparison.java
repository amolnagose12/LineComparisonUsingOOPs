package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		LineComparison line = new LineComparison();
		line.length();
		
	}
	
	public void length() {
//		taking input from user for co-ordinates
		Scanner input = new Scanner(System.in);
		System.out.println("Enetr the x co-ordinate of starting point :  " );
		int x1 = input.nextInt();
		
		System.out.println("Enetr the y co-ordinate of starting point :  " );
		int y1 = input.nextInt();
		
		System.out.println("Enetr the x co-ordinate of ending point :  " );
		int x2 = input.nextInt();
		
		System.out.println("Enetr the y co-ordinate of starting point :  " );
		int y2 = input.nextInt();
			
//		computing length of line
			
		int lengthOfline = ( (x2 - x1) ^ 2 + (y2 -y1)^2)^(1/2);
		System.out.println("length of line " + " "+ lengthOfline);
		input.close();	
	}
}