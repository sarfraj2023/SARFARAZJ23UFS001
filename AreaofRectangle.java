package javafc;

import java.util.Scanner;
public class AreaofRectangle {
	public static void main(String[] args) {
		double a,area,b;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		a=scan.nextDouble();
		System.out.println("Enter the breadth of rectangle:");
		b=scan.nextDouble();
		
		area=a*b;
		System.out.println("The area oof the rectangle is " +area);
	}

}
