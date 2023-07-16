package javafc;
import java.util.Scanner;
public class nestedloop {
public static void main(String[] args) {
	
	int i,j,n,sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number upto which table you need:");
	n=scan.nextInt();
	
	for(i=1;i<=n;i++)
	{
		System.out.println(+i +" table"  );	
		System.out.println();
		for(j=1;j<=10;j++)
		{
			sum=i*j;
	System.out.println(i+" x "+j+" = "+sum);
		}
		System.out.println();
	
}
	
	}
}
