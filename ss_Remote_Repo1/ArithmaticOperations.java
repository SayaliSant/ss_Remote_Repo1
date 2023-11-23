package ss_Remote_Repo1;

import java.util.Scanner;

public class ArithmaticOperations {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter integer values on which you want to perform Arithmatic Operation");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b +" is sum of a & b");
		System.out.println(a-b +" is difference of a & b");
		System.out.println(a*b +" is product of a & b");
		System.out.println((a+b)/2 +" is average of a & b");
		if(a>b)
		{
			System.out.println( a-b +" is distance between a & b");
			System.out.println(a +" is max no");
			System.out.println(b +" is min no");
			
			
		}
		else
		{
			System.out.println( b-a +" is distance between a & b");
			System.out.println(b +" is max no");
			System.out.println(a +" is min no");
		}
		sc.close();
		
	}

}
