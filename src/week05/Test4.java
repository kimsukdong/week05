package week05;

import java.util.Scanner;

public class Test4 {
	public static void main (String args[])  {
		Scanner scan = new Scanner(System.in);
		char yn = 'y';
		int sum=0, cnt2=0;

		System.out.println("컴퓨터가 수를 정했습니다. 시작합니다  ");
		while(yn =='y') {
			int k = (int) (Math.random()*100);			
			int k1,cnt = 0,low=0,high = 99;
			cnt2++;
			do {
				cnt++;
				System.out.println(low + " - " + high + " 사이의 값을 입력하세요");
				System.out.print(cnt + " >> ");
				k1 = scan.nextInt();
				if(k1 > k) { 
					System.out.println(" 더 낮은 값을 입력하세요  ");
					high = k1-1;
				}
				else if(k1 < k) { 
					System.out.println(" 더 높게 정하시죠  ");
					low = k1+1;
				}
				else 
					System.out.println(cnt + "번 만에"+" 숫자 " + k +"를 마추었습니다!!!");
				System.out.println(" ");
				}
			while(k != k1);
			
		System.out.print(" Try again(y/n) ");
		if(scan.next().equals("y")) {
			yn = 'y';
			sum+=cnt;
		}

		else 
			{
			sum+=cnt;
			yn = 'n';
			System.out.println(" 평균 추측 = " + (sum/cnt2));		
			}
		
		}
		scan.close();
	}
}
