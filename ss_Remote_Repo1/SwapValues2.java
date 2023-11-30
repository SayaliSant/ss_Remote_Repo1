package ss_Remote_Repo1;

import java.util.Scanner;

public class SwapValues2 {
	public static void main(String[] args) {
		
		System.out.println("Enyer 2 values of variable that you want to swap");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();//10
		int j = sc.nextInt();//7
		int k;
		
		k=i;
		i=j;
		j=k;
		
		System.out.println("value of i is : " + i);
		System.out.println("value of j is : " + j);
		
		sc.close();

}}

