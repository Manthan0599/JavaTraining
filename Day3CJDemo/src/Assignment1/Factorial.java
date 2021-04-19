package Assignment1;

public class Factorial {

	public static void main(String[] args) {
		int i,fact = 1;
		int num = 5;
		for(i = fact; i <= num; i++){
			fact = fact * i;
		}
		System.out.println("Factorial: "+fact);
	}

}
