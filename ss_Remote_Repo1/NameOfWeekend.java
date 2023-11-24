package ss_Remote_Repo1;

import java.util.Scanner;

public class NameOfWeekend {
	public static void main(String[] args) {
		//Take input from user
		System.out.println("Enter a number between 1 to 7 ");
		Scanner sc= new Scanner(System.in);
		int ch = sc.nextInt();
		
		switch(ch){  
	     
	    case 1: System.out.println("Day is Sunday!");  
	            break;
	    case 2: System.out.println("Day is Monday!");  
        		break;
	    case 3: System.out.println("Day is Tuesday!");  
        		break;
	    case 4: System.out.println("Day is Wednesday!");  
        		break;
	    case 5: System.out.println("Day is Thrusday!");  
        		break;
	    case 6: System.out.println("Day is Friday!");  
        		break;
	    case 7: System.out.println("Day is Satur8day!");  
        		break;
		default: System.out.println("Wrong input!");  
		}
		sc.close();
	}
}
