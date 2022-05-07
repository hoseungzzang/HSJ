package backjoon;

import java.util.Scanner;

public class test10872 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int a = scan.nextInt();
		int b = calc(a,1);
		System.out.println(b);
	}

	public static int calc(int a,int sum) {

		if (a >= 1) {
			sum*=a;
			return  calc(a - 1,sum);

		}
		return sum;
	}
	
}
