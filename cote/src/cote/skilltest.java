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
		int b= 626331;
		long num = 0;
		num = (long)b;
		long cnt = 0;
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
	public static void test7() {
	
		int x=2;
		int calc=0;
		char[] a = Integer.toString(x).toCharArray();
		
		if(a.length>1) {
			for(int i=0; i<a.length;i++) {
				
				calc+=(a[i]-'0');
				System.out.println(calc);
				
			}
			if(x%calc==0) {
				System.out.println("true");
			}
			else System.out.println("false");
			
		}
		else System.out.println("true");
		
		
	}
	
	public static void test8() {
		//대소문자 구분 더해진 대소문자 구하기
		String s= "a B Z";
		String answer = "";
		int n=4;
		
		char [] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			if (Character.isUpperCase(arr[i])) {
				if((int)arr[i]+n>90) {
					answer+=(char)(arr[i]+n-26);
				}
				else answer+=(char)(arr[i]+n);
			}
          

			else if (arr[i] == ' ') {
				answer+=' ';
			}else {
				if((int)arr[i]+n>122) {
					answer+=(char)(arr[i]+n-26);
				}
				else answer+=(char)(arr[i]+n);
			}
                
		}
		
	}
	public static void test9() {
		//test();
		int n = 10;
		int answer = 0;
		 char [] c = Integer.toString(n).toCharArray();
	        for(int i=0; i<c.length;i++){
	            answer+=(c[i]-'0');
	            
	        }
	        System.out.println(answer);
		
	}
	public static void test10() {
		//문자열뒤집기
		long n = 118372;
		
		String s = Long.toString(n);
		String [] arr = s.split("");
		 Arrays.sort(arr);
	s= String.join("",arr);
	StringBuffer sb = new StringBuffer(s); 
	
	Long.parseLong(sb.reverse().toString());
		
	}
	
	public static void test11() {
		//문자열 인덱스 찾기
		String[] seoul = {"Jane", "Kim"};
		int a =Arrays.asList(seoul).indexOf("Kim");
		 String answer = "김서방은 "+a+"에 있다";
		System.out.println(answer);
	
	
		
	}

}
