package javafc;

import java.util.Scanner;
public class AreaofTriangle {
public static void main(String[] args) {
	
	double a,b,area;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the height of the triangle:");
	a=scan.nextDouble();
	System.out.println("Enter the base of the triangle:");
	b=scan.nextDouble();
	
	area=0.5*a*b;
	System.out.println("The area of Triangle is "+area);
}
}
