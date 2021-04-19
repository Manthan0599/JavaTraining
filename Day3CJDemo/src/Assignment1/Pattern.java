package Assignment1;

public class Pattern {

	public static void main(String[] args) {
		char ch = '*';
		int row = 5;
		
		for (char i = 0; i < row; i++){
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
			

	}

}
