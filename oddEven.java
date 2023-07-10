package javafc;
import java.util.Scanner;
public class oddEven {
public static void main(String[] args) {
	int a;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number to be check: ");
	a=scan.nextInt();
	
	if(a%2==0)
		System.out.println("The given number is even:" +a);
	else
		System.out.println("The given number is odd:" +a);
}
}
