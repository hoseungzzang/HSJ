package cote;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class study {

	public static void main(String[] args) throws IOException {
	
		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		for(int i=0; i<arr1.length;i++) {
			String a=Integer.toBinaryString(arr1[i]);
			String b=Integer.toBinaryString(arr2[i]);
			if(a.length()<n) {
				int cnt = n-a.length();
				for(int j=0; j<cnt;j++) {
					a = "0"+a;
				}
			}
			
			if(b.length()<n) {
				int cnt = n-b.length();
				for(int j=0; j<cnt;j++) {
					b = "0"+b;
				}
			}
			
			answer[i]="";
		
			for(int j=0; j<n;j++) {
				int sum = (a.charAt(j)-'0') +(b.charAt(j)-'0');
				if(sum>0) {
					answer[i]+="#";
				}
				else answer[i]+=" ";
			}
		}

		
	}

	public static void ex1() throws IOException {

		// 문자열 내맘대로 정렬하기
		String[] strings = { "abce", "abcd", "cdxb", "cdxa" };
		String[] answer = new String[strings.length];
		int n = 2;
		Arrays.sort(strings);
		char[] c = new char[strings.length];

		for (int i = 0; i < strings.length; i++) {
			c[i] = strings[i].charAt(n);
		}
		Arrays.sort(c);

		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (c[i] == strings[j].charAt(n)) {
					answer[i] = strings[j];
					strings[j] = "";
					for (int k = 0; k <= n; k++) {
						strings[j] += "*";
					}

					break;
				}
			}
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

	public static void ex2() throws IOException {
		// 쉬운문제
		String s = "abcde";
		String answer = "";
		int num = s.length() / 2;
		if (s.length() % 2 == 0) {
			answer += s.charAt(num - 1);
			answer += s.charAt(num);
		} else
			answer += s.charAt(num);
	}
	public static void ex3() throws IOException {
		//쉬운문재
		int price =3;
		int money = 20;
		int count = 4;
		long answer= -1;
		int calc = 0;
		for(int i=1; i<=count; i++) {
			calc+=price*i;
		}
		if(calc>money) {
			System.out.println(calc-money);
		}
		else System.out.println(0);
		
	}
	public static void ex4() throws IOException {
		//정렬문제/
		int[] numbers = {2,1,3,4,1};
		int num = 0;
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(numbers);
		for(int i=0; i<numbers.length;i++) {
			for(int j=i+1; j<numbers.length;j++) {
				num = numbers[i]+numbers[j];
				if(list.indexOf(num)==-1) {
					list.add(num);
				}
			}
		}
		answer =new int[list.size()];
		
		for(int i=0; i<list.size();i++) {
		answer[i]=list.get(i);	
		}
		
		
	}
	public static void ex5() throws IOException {
		//쉬운문제
		int[] arr= {5, 9, 7, 10};
		
		int divisor = 5;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] answer = {};
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				list.add(arr[i]);
			}
		}
		if(list.size()==0) {
			
		}else
		{
			for(int i=0; i<list.size();i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
		}
		
	}
	public static void ex6() throws IOException {
		//캘린더 활용문제
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 24);
		int da = cal.get(Calendar.DAY_OF_WEEK);
		String day="";
		switch(da) {
		case 1:
			day ="SUN";
			break;
		case 2:
			day ="MON";
			break;
		case 3:
			day ="TUE";
			break;
		case 4:
			day ="WEN";
			break;
		case 5:
			day ="THU";
			break;
		case 6:
			day ="FRI";
			break;
		case 7:
			day ="SAT";
			break;
		}
		System.out.println(day);
	}
	public static void ex7() throws IOException {
		//진법계산 및 sb 리버스 사용
		int n=125;
		String nd="";
		while(n>0) {
			nd = (n%3) +nd;
			n/=3;
		}
		StringBuffer sb = new StringBuffer(nd);
		String answer1 = sb.reverse().toString();
		int answer = Integer.parseInt(answer1,3);
		System.out.println(answer);
	
		
	}
	public static void ex8() throws IOException {
		//예산계산 쉬웠음.
		int[] d = {2,2,3,3};
		int budget =10;
		int cnt=0;
		Arrays.sort(d);
		for(int i=0; i<d.length;i++) {
			if(d[i]>budget) {
				break;
			}
			budget-=d[i];
			cnt++;
		}
		System.out.println(cnt);
		
	}
	
	public static void ex9() throws IOException {
		//포켓몬찾기

		
		int[] nums = {3,1,2,3};
		int cnt = nums.length/2;
		int answer = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0; i<nums.length;i++) {
			if(arrayList.indexOf(nums[i])==-1) {
				arrayList.add(nums[i]);
			}
		}
		if(arrayList.size()>=cnt) {
			answer = cnt;
		}
		else answer = arrayList.size();
		
	
		
	}
	public static void ex10() throws IOException {
		//비밀지도
		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		for(int i=0; i<arr1.length;i++) {
			String a=Integer.toBinaryString(arr1[i]);
			String b=Integer.toBinaryString(arr2[i]);
			if(a.length()<n) {
				int cnt = n-a.length();
				for(int j=0; j<cnt;j++) {
					a = "0"+a;
				}
			}
			
			if(b.length()<n) {
				int cnt = n-b.length();
				for(int j=0; j<cnt;j++) {
					b = "0"+b;
				}
			}
			
			answer[i]="";
		
			for(int j=0; j<n;j++) {
				int sum = (a.charAt(j)-'0') +(b.charAt(j)-'0');
				if(sum>0) {
					answer[i]+="#";
				}
				else answer[i]+=" ";
			}
		}

		
	}

}
