package week05;

import java.util.Scanner;

public class Test4 {
	public static void main (String args[])  {
		Scanner scan = new Scanner(System.in);
		char yn = 'y';
		int sum=0, cnt2=0;

		System.out.println("��ǻ�Ͱ� ���� ���߽��ϴ�. �����մϴ�  ");
		while(yn =='y') {
			int k = (int) (Math.random()*100);			
			int k1,cnt = 0,low=0,high = 99;
			cnt2++;
			do {
				cnt++;
				System.out.println(low + " - " + high + " ������ ���� �Է��ϼ���");
				System.out.print(cnt + " >> ");
				k1 = scan.nextInt();
				if(k1 > k) { 
					System.out.println(" �� ���� ���� �Է��ϼ���  ");
					high = k1-1;
				}
				else if(k1 < k) { 
					System.out.println(" �� ���� ���Ͻ���  ");
					low = k1+1;
				}
				else 
					System.out.println(cnt + "�� ����"+" ���� " + k +"�� ���߾����ϴ�!!!");
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
			System.out.println(" ��� ���� = " + (sum/cnt2));		
			}
		
		}
		scan.close();
	}
}
