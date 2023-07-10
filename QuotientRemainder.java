package javafc;

import java.util.Scanner;
public class QuotientRemainder {
public static void main(String[] args) {
	int a,b,sum,sum1;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");
	a=scan.nextInt();
	System.out.println("Enter the number:");
	b=scan.nextInt();
	
	sum=a/b;
	sum1=a%b;
	System.out.println("Quotient of the given number is : " + sum);
	System.out.println("Remainder of the given number is :" + sum1);
}
}
