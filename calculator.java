import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
int num2;
String operation;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter variable 1 'Must be an integer' ");
num1 = scanner.nextInt();
scanner.nextLine();

System.out.println("Enter variable 2 'Must be an integer' ");
num2 = scanner.nextInt();
scanner.nextLine();




Scanner op = new Scanner(System.in);
System.out.println("Enter operation (+,-,/,*)");

operation = op.next();

if (operation.equals("+"))
{
	System.out.println("Your answer is " + (num1 + num2));
}

if (operation.equals("-"))
{
	System.out.println("Your answer is " + (num1 - num2));
}

if (operation.equals("/"))
{
	System.out.println("Your answer is " + (num1 / num2));
}
if (operation.equals("*"))
{
	System.out.println("Your answer is " + (num1 * num2));
}
	}

}
