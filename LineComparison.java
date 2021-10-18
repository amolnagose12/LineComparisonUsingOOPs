package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	
	//taking input from user	
	public void comparisionOfLine() {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enetr the x co-ordinate of starting point of line 1:  " );
			int x1 = input.nextInt();
			
			System.out.println("Enetr the y co-ordinate of starting point of line 1 :  " );
			int y1 = input.nextInt();
			
			System.out.println("Enetr the x co-ordinate of ending point of line 1:  " );
			int x2 = input.nextInt(); 
			
			System.out.println("Enetr the y co-ordinate of starting point of line 1:  " );
			int y2 = input.nextInt();
			
			System.out.println("Enetr the x co-ordinate of starting point of line 2:  " );
			int x_1 = input.nextInt();
			
			System.out.println("Enetr the y co-ordinate of starting point of line 2 :  " );
			int y_1 = input.nextInt();
			
			System.out.println("Enetr the x co-ordinate of ending point of line 2:  " );
			int x_2 = input.nextInt(); 
			
			System.out.println("Enetr the y co-ordinate of starting point of line 2:  " );
			int y_2 = input.nextInt();
			
			int lengthOfline1 = ((x2 - x1) ^ 2 + (y2 -y1)^2)^(1/2);
			String line1 = Integer.toString(lengthOfline1); 
			int lengthOfline2 = ( (x_2 - x_1) ^ 2 + (y_2 -y_1)^2)^(1/2);
			String line2 = Integer.toString(lengthOfline2);
			
			int value = line1.compareTo(line2);
			
			if (value == 0 ) {
				System.out.println("Length of both lines is equal");
				
				}
			else if( value < 0 ) {
				System.out.println("Length of line one is less than line2");
			}
			else {
				System.out.println("Length of line1 is greater than line2");
			}
			input.close();
	}

	public static void main(String[] args) {
		LineComparison compare = new LineComparison();
		compare.comparisionOfLine();

	}
}
	

