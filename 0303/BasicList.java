package java1;

import java.util.Scanner;

public class BasicList {
	public static void main (String [] args) {
		
		int[] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 5�� �Է� : ");
		
		for(int i = 0; i < 5; i++) {
			num[i] = scanner.nextInt();
		}
		
		
		System.out.print("�Է��� ���ڴ� : ");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(num[i] );
		}
		
	}
}
