package ss_Remote_Repo1;

import java.util.Scanner;

public class TempretureConversion {
	public static void main(String[] args) {
		
		//Take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value you want to convert");
		float value = sc.nextFloat();
		
		//Choose the scale
		 System.out.println("Enter in which scale you want to convert the tempreture?");
		 Scanner sc1 = new Scanner(System.in);
		 String st = sc1.next();
		 switch(st){  
		     
		    case "Kelvin": float f1= value+273;
		    			   System.out.println("Kelvin value is: " + f1);  
		                   break;
		    
		    case "kelvin": float f2= value+273;
		    			   System.out.println("Kelvin value is: " + f2);  
		                   break;
		                   
		    case "Fahrenheit": float f3 = value+32;
		     				   System.out.println("Fahrenheit value is: " + f3);  
		                       break;
		                       
		                       
		    case "fahrenheit": float f4 = value+32;
		    				   System.out.println("Fahrenheit value is: " + f4); 
		                       break;
		                       
		    default:System.out.println(273 + value + " is Kelvin value" );  
		            System.out.println(32 + value + " is Fahrenheit value");  
		 }
	}
}
