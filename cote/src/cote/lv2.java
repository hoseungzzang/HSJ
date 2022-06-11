package cote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class lv2 {

	public static void main(String[] args) throws IOException {
		String s ="1111111";
		int sum=0;
		int roop=0;
		int[] answer = new int[2];
		while(!s.equals("1")) {
			int cnt=0;
			if(s.contains("0")) {
				for(int i=0; i<s.length();i++) {
					if(s.charAt(i)=='0') {
						cnt++;
					}
				}	
			}
			sum+=cnt;
			s= s.replace("0", "");
			s= Integer.toBinaryString(s.length());
			roop++;
		}
		answer[0] = roop;
		answer[1] = sum;
	}

	public static void ex1() {
		// 최솟값만들기
		int[] A = { 1, 2 };
		int[] B = { 3, 4 };
		int[] arr = new int[B.length];
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = B.length - 1; i >= 0; i--) {
			arr[arr.length - 1 - i] = B[i];
		}
		int sum = 0;
		for (int i = 0; i < B.length; i++) {
			sum += A[i] * arr[i];
		}
		System.out.println(sum);
	}

	public static void ex2() throws IOException {
		// 새싹만들기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("         ,r'\"7\nr`-_   ,'  ,/\n \\. \". L_r'\n   `~\\/\n      |\n      |");

		bw.flush();
	}

	public static void ex3() throws IOException {
		// 시간계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str = new StringTokenizer(br.readLine());
		int si = Integer.parseInt(str.nextToken());
		int bun = Integer.parseInt(str.nextToken());
		int add = Integer.parseInt(br.readLine());
		int sum = bun + add;
		if (sum / 60 >= 1) {
			si += sum / 60;
			bun = sum % 60;
			if (si > 23) {
				si = si % 24;
			}
			bw.write(si + " " + bun);
		} else
			bw.write(si + " " + sum);

		bw.flush();
	}

	public static void ex4() throws IOException {
		// 정렬,카운팅,
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int roop = str.countTokens();
		int[] arr = new int[roop];
		int[] count = new int[roop];
		int big = 0;
		int sum = 0;
		for (int i = 0; i < roop; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (list.indexOf(arr[i]) == -1) {
				list.add(arr[i]);
				count[i]++;
			} else
				count[list.indexOf(arr[i])]++;
		}
		int max = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (count[i] > max) {
				max = count[i];
				index = i;
			}
		}
		if (max == 3) {
			sum = 10000 + arr[index] * 1000;
		} else if (max == 2) {
			sum = 1000 + arr[index] * 100;
		} else
			sum = big * 100;
		bw.write(sum + "");
		bw.flush();
	}

	public static void ex5() throws IOException {
		// 방무계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(str.nextToken());
		double b = Double.parseDouble(str.nextToken());
		double sum = a - (a * b / 100);

		if (sum >= 100) {
			bw.write(0 + "");
		} else
			bw.write(1 + "");

		bw.flush();
	}

	public static void ex6() throws IOException {
		// 소수개수구하기 에라토스테네스의 채 구현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int max = 0;
		int cnt = 0;
		StringTokenizer str = new StringTokenizer(br.readLine());
		for (int i = 0; i < roop; i++) {
			arr.add(Integer.parseInt(str.nextToken()));
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		int[] arr2 = new int[max + 1];
		arr2[0] = arr2[1] = 1;
		for (int i = 0; i <= max; i++) {
			if (arr2[i] == 0) {
				if (arr.indexOf(i) != -1) {
					cnt++;
				}
				for (int j = i + i; j <= max; j += i) {
					arr2[j] = 1;
				}
			}

		}
		bw.write(cnt + "");

		bw.flush();
	}

	public static void ex7() throws IOException {
		// 소수구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		while (roop != 0) {
			int cnt = 0;
			int[] arr2 = new int[(roop * 2) + 1];
			arr2[0] = arr2[1] = 1;
			for (int i = 0; i <= (roop * 2); i++) {
				if (arr2[i] == 0) {
					if (i > roop) {
						cnt++;
					}
					for (int j = i + i; j <= (roop * 2); j += i) {
						arr2[j] = 1;
					}
				}

			}
			roop = Integer.parseInt(br.readLine());
			bw.write(cnt + "\n");
		}

		bw.flush();
	}

	public static void ex8() throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] nums = { 1, 2, 7, 6, 4 };
		int max = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 2) {
				break;
			}
			for (int j = i + 1; j < nums.length; j++) {
				if (j == nums.length - 1) {
					break;
				}
				for (int k = j + 1; k < nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k];
					list.add(num);
					if (max < num) {
						max = num;
					}
				}
			}
		}
		int cnt = 0;
		int[] arr = new int[max + 1];
		arr[0] = arr[1] = 1;
		for (int i = 0; i <= max; i++) {
			if (arr[i] == 0) {
				if (list.indexOf(i) != -1) {
					cnt += Collections.frequency(list, i);

				}
				for (int j = i + i; j <= max; j += i) {
					arr[j] = 1;
				}
			}

		}
		bw.write(cnt + "");

		bw.flush();
	}

	public static void ex9() throws IOException {
		// 정규표현식
		String new_id = "=.=";

		String answer = "";
		answer = new_id.toLowerCase();// 1단계
		answer = answer.replaceAll("[^a-z|0-9|_|.|-]", "");// 2단계
		answer = answer.replaceAll("\\.{2,}", ".");// 3단계
		int cnt = answer.length();
		if (answer.charAt(0) == '.') { // 4단계
			if (answer.length() == 1) {
				answer = "";
			} else
				answer = answer.substring(1);
		}

		if (answer == "") {
			for (int i = 0; i < cnt; i++) {
				answer += "a";
			}
		} else if (answer.charAt(answer.length() - 1) == '.') {
			answer = answer.substring(0, answer.length() - 1);
		}

		if (answer.length() > 15) {
			answer = answer.substring(0, 15);
			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
		}
		if (answer.length() <= 2) {
			for (int i = answer.length(); i < 3; i++) {
				answer += answer.charAt(answer.length() - 1);
			}
		}
		System.out.println(answer);

	}

	public static void ex10() throws IOException {
		// 완전탐색
		int[] answers = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[][] man = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		ArrayList<Integer> list = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < man.length; i++) {
			int cnt = 0;
			int roop = 0;
			int roop2 = 0;

			while (roop <= answers.length - 1) {
				if (answers[roop] == man[i][roop2]) {
					cnt++;
				}
				roop++;
				roop2++;
				if (roop2 == man[i].length) {
					roop2 = 0;
				}
			}
			list.add(cnt);
			if (max <= cnt) {
				max = cnt;
			}
		}
		int roop = list.size();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < roop; i++) {
			if (max == list.get(i)) {
				list2.add(i + 1);
			}
		}
		int[] answer = new int[list2.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list2.get(i);
		}

	}

	public static void ex11() throws IOException {
		// 소수구하기
		int n = 5;
		int[] arr = new int[n + 1];
		int answer = 0;
		arr[0] = arr[1] = 1;
		for (int i = 0; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;
				for (int j = i + i; j <= n; j += i) {
					arr[j] = 1;
				}
			}
		}
		System.out.println(answer);

	}

	public static void ex12() throws IOException {

		String s = "try hello world  ";
		String cnt = s.replace(" ", "-");
		int cnt2 = 0;
		for (int i = 0; i < cnt.length(); i++) {
			if (cnt.charAt(i) == '-') {
				cnt2++;
			}
		}
		String[] arr = s.split(" ");
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (j % 2 == 0) {
					char word = Character.toUpperCase(arr[i].charAt(j));
					answer += word;
				} else {
					char word = Character.toLowerCase(arr[i].charAt(j));
					answer += word;
				}

			}
			if (cnt2 != 0) {
				answer += " ";
				cnt2--;
			}

		}
		if (cnt2 != 0) {
			for (int i = cnt2 - 1; i >= 0; i--) {
				answer += " ";
			}
		}
		System.out.println(answer);
	}

	public static void ex13() throws IOException {
		// 다음수찾기 효율성 ㅅ...
		int n = 15;
		int answer = 0;
		String n2 = Integer.toBinaryString(n);
		int cnt = n2.replace("0", "").length();
		n++;
		while (answer != n) {
			n2 = Integer.toBinaryString(n);
			if (cnt == n2.replace("0", "").length()) {
				answer = n;
			} else
				n++;

		}
		System.out.println(answer);
	}

	public static void ex14() throws IOException {
		String s = "-1 -2 -3 -4";
		String[] arr = s.split(" ");
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arr2);
		String answer = "";
		answer += Integer.toString(arr2[0]) + " " + Integer.toString(arr2[arr2.length - 1]);
		System.out.println(answer);
	}

	public static void ex15() throws IOException {
		// 행렬곱셈
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 1, 4 }, { 2, 5 }, { 3, 6 } };
		// int [][] arr1 = {{1,4},{3,2},{4,1}};
		// int [][] arr2 = {{3,3},{3,3}};
		int[][] answer = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {

				for (int k = 0; k < arr2.length; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];

				}
				System.out.println(answer[i][j]);
			}
		}
	}

	public static void ex16() throws IOException {
		// 문자열만들기
		String s = "  A dsad 2Wdas sad   ";
		int len = s.length();
		s = s.toLowerCase();
		String answer = "";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() != 0) {
				String c = arr[i].substring(0, 1).toUpperCase();
				answer += c + arr[i].substring(1);
			}

			if (i < arr.length - 1) {
				answer += " ";
			}
		}
		if (len > answer.length()) {
			int cnt = len - answer.length();
			for (int i = 0; i < cnt; i++) {
				answer += " ";
			}
		}
		System.out.println(answer);
	}

	public static void ex17() throws IOException {

		int[] arr = { 1, 2, 3 };
		for (int i = 1; i < arr.length; i++) {
			int max = Integer.max(arr[i - 1], arr[i]);
			int min = Integer.min(arr[i - 1], arr[i]);
			int calc = max * min;
			while (min != 0) {
				int swap = max % min;
				max = min;
				min = swap;
			}
			arr[i] = calc / max;

		}
		System.out.println(arr[arr.length - 1]);

	}

	public static void ex18() throws IOException {
		String s = "(";
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (cnt < 0) {
				System.out.println("false");
				break;
			}
			if ('(' == s.charAt(i)) {
				cnt++;
			} else if (')' == s.charAt(i)) {
				cnt--;
			}

		}
		if (cnt > 0 || cnt < 0) {
			System.out.println("false");
		} else
			System.out.println("true");
	}

	public static void ex19() throws IOException {
		String s = "cdcd";
		Stack<Character> stack = new Stack<>(); // char형 스택 선언
		int answer = 1;
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else
				stack.push(s.charAt(i));
		}
		if (!stack.isEmpty()) {
			answer = 0;
		}

		System.out.println(answer);
	}
	public static void ex20() throws IOException {
		int[] progresses= {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int cnt=0;
		int result=0;
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			result = progresses[i];
			cnt=0;
			while(result<100) {
				result +=speeds[i];
				cnt++;
			}
		
			if(i==0) {
				stack.push(cnt);
			}
			else {
				if(stack.firstElement()>=cnt) {
					stack.push(cnt);
				}
				else {
					stack2.push(stack.size());
					stack.clear();
					stack.push(cnt);
				}
			}
		}
		stack2.push(stack.size());
		int[]answer = new int[stack2.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = stack2.get(i);
		}
	
	}
}
