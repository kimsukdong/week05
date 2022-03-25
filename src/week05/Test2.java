package week05;

import java.util.Scanner;

public class Test2 {
	public static void main (String args[])  {
		String s;
		Scanner scan = new Scanner(System.in);
		char a;
		
			System.out.print("하나의 문자를 입력하시오 : ");
			s = scan.next();
			a = s.charAt(0);
			int k = a-'a';
			for(int i =0; i<=k; i++) {
				for(int j = 0; j<=i; j++)
					System.out.print((char)((a-k)+j) + " ");
				System.out.println(" ");
			}
	}
}
