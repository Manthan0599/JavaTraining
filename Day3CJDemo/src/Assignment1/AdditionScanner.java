package Assignment1;
import java.util.*;
public class AdditionScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 1st Operand:");
		 int a = sc.nextInt();
		 System.out.println("Enter 2nd Operand:");
		 int b = sc.nextInt();
		 System.out.println("Enter 3rd Operand:");
		 int c = sc.nextInt();
		 
		 int sum= a + b + c;
		 System.out.println("Sum of three numbers is: "+sum);
		 sc.close();
	}

}
