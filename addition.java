package javafc;

import java.util.Scanner;


public class addition {
public static void main(String[] args) {
	
	int a,b;

	Scanner reader1=new Scanner(System.in);
	System.out.println("Enter the number:");
	a=reader1.nextInt();
	
	Scanner reader2=new Scanner(System.in);
	System.out.println("Enter the number:");
	b=reader2.nextInt();
	

	System.out.println("Sum = " + (a+b));
	
	
			
}
}
