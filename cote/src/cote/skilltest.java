package cote;

import java.util.Arrays;

public class skilltest {

	public static void main(String[] args) {
		String s = "a234";
		// 숫자 영어 판별
		// 영문자가 있는지 검색
		if (s.matches(".*[a-zA-Z].*")) {
			System.out.println("영문자가 포함되어 있습니다.");
		} else {
			System.out.println("영문자가 포함되어 있지 않습니다.");
		}

		// 숫자가 있는지 검색
		if (s.matches(".*[0-9].*")) {
			System.out.println("숫자가 포함되어 있습니다.");
		} else {
			System.out.println("숫자가 포함되어 있지 않습니다.");
		}
	}

	public static void test2() {
		// 제곱근 검색
		long n = 121;
		Double a = Math.sqrt(n);

		System.out.println(a);

		if (a == a.intValue()) {

			System.out.println(a.intValue());
			a = Math.pow((a + 1), 2);

		} else
			a = (double) -1;

		System.out.println(a);
	}

	public static void test3() {

		// 문자열 뒤집기
		String STR = "Zbcdefg";
		char[] StringtoChar = STR.toCharArray();
		Arrays.sort(StringtoChar);
		String SortedString = new String(StringtoChar);
		StringBuffer sb = new StringBuffer(SortedString);

		String reversedStr = sb.reverse().toString();

		System.out.println("The Unsorted String is : " + STR);
		System.out.println("The Sorted String is : " + reversedStr);
	}

	public static void test4() {

		int num = 3;
		int cnt = 0;
		// 홀수 짝수 구분 제어
		for (int i = 0; i < 500; i++) {
			if (num == 1) {
				break;
			} else {
				if (num % 2 == 0) {
					num = num / 2;
					System.out.println(num);
					cnt++;
				} else {
					num = (num * 3) + 1;
					System.out.println(num);
					cnt++;
				}
			}
		}
		if (num != 1) {
			cnt = -1;
		}
		System.out.println(cnt);
	}
	public static void test5() {
		//배열합구하기
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 =  {{3,4},{5,5}};
		int[][] answer = new int[arr1.length][arr1[arr1.length-1].length];
		System.out.println(arr1[arr1.length-1].length);
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[arr1.length-1].length;j++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
				System.out.println(answer[i][j]);
			}
			
		}
	}
	public static void test6() {
		String num = "01033334444";
		char [] num2 = num.toCharArray();
		String answer = "";
		for(int i= 0; i< num2.length; i++) {
			if(i<num2.length-4) {
				answer += '*';
			}
			else answer+= num2[i];
		}
	
		
		System.out.println(answer);
		
	}

}
