package week05;

public class Test3 {
	public static void main(String[] args){
		int count2 = 0;
		System.out.print("2���� 100���� ��� �Ҽ� : ");
		for(int i = 2; i <= 100; i++){
			count2 = 0;
			for(int k = 2; k < i; k++){
				if((i%k) == 0){
					count2++;
					break;
				}
			}
			if(count2 == 0)
				System.out.print(" " + i);
		}
	}
}
