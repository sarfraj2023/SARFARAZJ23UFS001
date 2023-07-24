package javafc;

import java.util.Scanner;
public class AreaofSquare {
public static void main(String[] args) {
	
	double a,area;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the side of the Square:");
	a=scan.nextDouble();
	area=a*a;
	
	System.out.println("The area of the Square is " +area);
}
}
