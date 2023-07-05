package javafc;
import java.util.Scanner;
public class Integer {
public static void main(String[] args) {
	int a,b;
	
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter the first integer");
	a=reader.nextInt();
	

	System.out.println("Enter the Second integer");
	b=reader.nextInt();
	
	System.out.println("The given integer are: "+a+" and "+b);
}
}
