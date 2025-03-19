package variables;

import java.util.Scanner;

public class control statements {

	public static void main(String[] args) {

           Scanner in = new Scanner(System.in);
           
           System.out.println("Enter the martial status: (Married/unmarried): ");
           String ms = in.nextline().toLowercase();
           
           if(ms.equals("married")) {
        	   System.out.println("you are eligible for insurance.. ");
        	   } else if(ms.equals("unmarried ")) {
        	   System.out.println("enter the below details... ");
        	   System.out.println("enter the gender:(male/female) ");
               String gender = in.nextLine().toLowerCase();
               System.out.println("enter the age");
              
        	   
        	   if (gender.equals("male")) {
        		   
        	   }else if (gender.equals ("female")) {
        		   
        	   }else {
        		   System.out.println("invalid gender input...");
        	    }
        	   }else {
        		   System.out.println("invalid martial status");
        	   }
        		 
	}
	
	
}