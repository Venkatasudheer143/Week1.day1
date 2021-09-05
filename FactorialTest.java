package week1.day1;

public class FactorialTest {

	public static void main(String[] args) {
		int input = 5;
		int pattern=input;
		int fact = 1;

		for (int i = 1; i <= input; i++) {
			fact = fact * i;
			System.out.print(i+"*");
		} // for
		//System.out.println("Factorial of " + input + " is: " + fact);
		System.out.print(" => "+fact);
		

	}

}
