package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n=8,firstNumber=0,secondNumber=1;
		System.out.println("The fibo series is  " + firstNumber + "\n" + secondNumber);
		
		for (int i=2;i<n;i++) {
			
			int sum;
			sum=firstNumber+secondNumber;
			System.out.println(+sum);
			firstNumber=secondNumber;
			secondNumber=sum;
			
			
			
		}
		
		
	}

}
