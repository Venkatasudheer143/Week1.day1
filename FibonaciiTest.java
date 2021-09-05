package week1.day1;

public class FibonaciiTest {

	public static void main(String[] args) {
		int range =8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.print(firstNum);
		for(int i=1;i<range;i++) {
			sum = firstNum+secNum;
			System.out.print(","+secNum);
			firstNum=secNum;
			secNum=sum;
		}//for

	}

}
