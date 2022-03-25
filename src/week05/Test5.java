package week05;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Input data = ");
		int n = s.nextInt();
		
		System.out.println("Â¦¼öÀÇ ÇÕ = "+ evenSum(n));
		System.out.println("È¦¼öÀÇ ÇÕ = "+ oddSum(n));		
	}
	
	public static int evenSum(int n) {
		int sum = 0;
		
		for(int i=2; i<=n;i+=2)
			sum+=i;
		return sum;
	}
	public static int oddSum(int n) {
		int sum = 0;
		
		for(int i=1; i<=n;i+=2)
			sum+=i;
		return sum;
	}
}
