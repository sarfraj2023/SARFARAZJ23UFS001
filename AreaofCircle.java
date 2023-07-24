package javafc;
import java.util.Scanner;

public class AreaofCircle {
public static void main(String[] args) {
	
	double a,area;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the radius of the circle:");
	a=scan.nextDouble();
	
	area=3.14*a*a;
	System.out.println("The area of the Circle is " +area);
}
}
