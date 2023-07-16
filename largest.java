package javafc;
import java.util.Scanner;

public class largest {
	public static void main(String[] args) {
		
	
	int a,b,c;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number :");
	
	a=scan.nextInt();
	
	System.out.println("Enter the second number :");
	
	b=scan.nextInt();
	
	System.out.println("Enter the third number :");
	
	c=scan.nextInt();
	
	if(a>b && a>c)
	System.out.println("The largest number is " +a);
     	
	
	else if (b > a && b >= c)
	System.out.println("The largest number is " +b);
	
	else		
	System.out.println("The largest number is " +c);
		
		
	
	

}
}
