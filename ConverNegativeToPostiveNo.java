package week1.day1;

public class ConverNegativeToPostiveNo {

	public static void main(String[] args) {
		int number =-40;
		int inputNumber=number;
		if(number<0) {
			//System.out.println(number+" is negative number");
			number = -(number);
			System.out.println("The number "+inputNumber+" is Converted to "+number);
		}
		

	}

}
