package myProject31;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int cacheNumber,firstNumber=1,secondNumber=0;
		System.out.print("Please enter a number to arrange size of fibonacci series:");
		int sizeNumber=input.nextInt();
		//9 Elemanlı Fibonacci Serisi : 1 1 2 3 5 8 13 21 34
		for(int i=1;i<=sizeNumber;i++) {
			cacheNumber=firstNumber+secondNumber;
			System.out.print(cacheNumber+" ");
			firstNumber=secondNumber;
			secondNumber=cacheNumber;
		}
	
	}

}
