
import java.util.Scanner;
public class CountChange {

	public static void main(String[] args) {
		int quarters;   
	      int dimes;      
	      int nickels;    
	      int pennies;    
	      
	      Scanner scanner = new Scanner( System.in );
	      
	      double dollars; 
	      
	      // Ask the user for the number of each type of coin. 
	      
	      System.out.print("Enter the number of quarters: ");
	      quarters = scanner.nextInt();
	      scanner.nextLine();
	      
	      System.out.print("Enter the number of dimes: ");
	      dimes = scanner.nextInt();
	      scanner.nextLine();
	      
	      System.out.print("Enter the number of nickels: ");
	      nickels = scanner.nextInt();
	      scanner.nextLine();
	      
	      System.out.print("Enter the number of pennies: ");
	      pennies = scanner.nextInt();
	      scanner.nextLine();
	      
	      
	      
	      dollars = (0.25 * quarters) + (0.10 * dimes) 
	                          + (0.05 * nickels) + (0.01 * pennies); 
	      
	      
	      // return this information back to user
	      
	      System.out.println();
	      System.out.print("The total in dollars is $");
	      System.out.println( dollars);
	      System.out.println();
	   
	   } 

	}


