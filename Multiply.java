package javafc;
import java.util.Scanner;
public class Multiply {
public static void main(String[] args) {
	
	int a,b;
	 
	Scanner reader =new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=reader.nextInt();
	
	System.out.println("Enter the second number");
	b=reader.nextInt();
	
	System.out.println("The multipication of the given number is : " + a*b);
	
}
}
