package week1.day1;

public class IsPrimeNo {

	public static void main(String[] args) {
		int number =97;
		int count= 0;
		
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}//if
		}//for
		if(count==2) {
			System.out.println(number+" is prime Number");
		}else {
			System.out.println(number+" is not a prime number");
		}

	}

}
