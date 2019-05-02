
import java.util.Scanner;
public class GreetUser {


public static void main(String[] args) {


	    
        Scanner scanner = new Scanner( System.in );
    
        String usersName;      
        String upperCaseName;   
        

        System.out.print("Please enter your name: ");
        usersName = scanner.nextLine();
        
        upperCaseName = usersName.toUpperCase();
        
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");
    
    }  

}
