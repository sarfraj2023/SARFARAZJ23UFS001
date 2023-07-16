package javafc;
import java.util.Scanner;

public class switchdemo {
	public static void main(String[] args) {
		
		String a;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character to be check: ");
		a=scan.next();
	

	switch(a)
	{
	case "a":
	{
		System.out.println("The given character is vowvels");
		break;}
	
	case "e":
	{
		System.out.println("The given character is vowvels");
		break;
	}
	
	case "i":
	{
		System.out.println("The given character is vowvels");
		break;
	}
	
	case "o":
	{
		System.out.println("The given character is vowvels");
		break;
	}
	
	case "u":
	{
		System.out.println("The given character is vowvels");
		break;
	}
	
	default:
		System.out.println("The given character is not a vowvel");
	}

	

	}
}
