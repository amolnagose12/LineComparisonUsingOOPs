package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	
	public String line1;
	public String line2;
	
	public void equalityOfLine() {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enetr the x co-ordinate of starting point of line 1:  " );
	int x1 = input.nextInt();
	
	System.out.println("Enetr the y co-ordinate of starting point of line 1 :  " );
	int y1 = input.nextInt();
	
	System.out.println("Enetr the x co-ordinate of ending point of line 1:  " );
	int x2 = input.nextInt();
	
	System.out.println("Enetr the y co-ordinate of ending point of line 1:  " );
	int y2 = input.nextInt();
	
	System.out.println("Enetr the x co-ordinate of starting point of line 2:  " );
	int x_1 = input.nextInt();
	
	System.out.println("Enetr the y co-ordinate of starting point of line 2 :  " );
	int y_1 = input.nextInt();
	
	System.out.println("Enetr the x co-ordinate of ending point of line 2:  " );
	int x_2 = input.nextInt(); 
	
	System.out.println("Enetr the y co-ordinate of ending point of line 2:  " );
	int y_2 = input.nextInt();
	
	int lengthOfline1 = ( (x2 - x1) ^ 2 + (y2 -y1)^2)^(1/2);
	
	String line1 = Integer.toString(lengthOfline1); 
	
	int lengthOfline2 = ( (x_2 - x_1) ^ 2 + (y_2 -y_1)^2)^(1/2);

	String line2 = Integer.toString(lengthOfline2);
	
	System.out.println(line1.equals(line2));
	
	input.close();
	}


	public static void main(String[] args) {
		LineComparison line = new LineComparison();
		line.equalityOfLine();
	}
}
	
		
	

