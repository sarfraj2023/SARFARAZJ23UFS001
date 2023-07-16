package javafc;
import java.util.Scanner;

public class Whileloop {
public static void main(String[] args) {

	int num,i,j=1,k,sum=0;
	
	Scanner scan=new Scanner(System.in);
	
	
	
	

	while(j==1) {

		System.out.println("Enter the table number:");
		num=scan.nextInt();
		
		for(i=1;i<=num;i++) {
			System.out.println(+i +" table"  );	
			System.out.println();
			for(k=1;k<=10;k++) {
		sum=i*k;
			System.out.println(i+" x "+k+" =" +sum);
			}
			System.out.println();
			
		
			
		}
		System.out.print("Press 1 to Continue or");
		System.out.println(" Press 0 to exit:");
		j=scan.nextInt();
		if(j==0)
			System.out.println("You Exit");
	
}
}
}