package javafc;
import java.util.Scanner;
public class Vowel {
public static void main(String[] args) {
	char a;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the character to check whether it is vowel or not:");
	a=scan.next().charAt(0);
	
	if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
		System.out.println("The given character is \" Vowel \" :");
	else
		System.out.println("The given character is \" Consonant \" :");
}
}
