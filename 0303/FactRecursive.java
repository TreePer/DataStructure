package java1;

import java.util.Scanner;

public class FactRecursive {
	
	public static long fact(long n) {
		if (n <= 1)
			return 1;
		else
			return fact(n-1) * n;
	}
	
	public static void main(String[] args) {
		
		int i;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("����� ������ �Է��Ͻÿ� : ");
		i = scanner.nextInt();
		
		System.out.print("���丮�� �� ��� : " + fact(i) );
		
	}
	
}
