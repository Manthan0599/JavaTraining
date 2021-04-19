package module7;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		if(args.length>0) {
			try{
				a = Integer.parseInt("10");
				b = Integer.parseInt("0");
				int result = a / b;
				System.out.println("Result is: "+result);
			}catch (NumberFormatException nfe) {
				System.out.println("Only Intiger are allow");
			} catch (ArithmeticException ae) {
				System.out.println("Division with zero is not possible");
			}

			
			
			
		}
	}

}
