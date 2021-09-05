package week1.day1;

public class IsPrimeOrNot {

	public static void main(String[] args) {
		int input=100;
		boolean flag = false;
		
		//condition for non prime number check
		for(int i=2;i<=input/2;i++) {
			
			if (input%i==0) {
				flag=true;
				break;
			}//if
		}//for
		if(!flag)
		System.out.println(input+" is a prime number");
		else
			System.out.println(input+" is not a prime number");
	}

}
