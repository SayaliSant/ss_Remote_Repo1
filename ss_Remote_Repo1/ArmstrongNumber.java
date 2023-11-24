package ss_Remote_Repo1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		int ch = sc.nextInt();
		
		int rem, cube, sum=0;
		int temp=ch; //place input in temp variable
		while(temp>0)
		{   
			rem=temp%10; //take the reminder in rem variable
			cube=rem*rem*rem; //calculate the cube of rem
			sum=sum+cube;  // sum the cubes
			temp=temp/10; //divide given no by 10 and take divident as ch
		}
		System.out.println("Given input Number is: "  +ch);
		System.out.println("The sum of cubes of no is:  "  +sum);
		
		if(ch!=sum)
		{
			System.out.println("Number is not Amstrong Number");
		}
		else 
		{
			System.out.println("Number is Amstrong Number");
		}
		
		
		sc.close();
}
}
