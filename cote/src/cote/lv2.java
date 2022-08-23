package cote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class lv2 {
//앞에가 비동의 뒤에가 동의
	public static void main(String[] args) throws IOException {
		int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
		int answer = 0;
		String arr = Arrays.toString(topping).replaceAll("\\[|]", "");
		String [] arr2 = arr.split(", ");
		ArrayList<String> little = new ArrayList<String>(Arrays.asList(arr2));
		ArrayList<Integer> bro = new ArrayList<Integer>();
		for(int i=0; i<topping.length; i++) {
			little.remove(0);
				if(bro.indexOf(topping[i])==-1) {
					bro.add(topping[i]);
				}
				List<String> newList = little.stream().distinct().collect(Collectors.toList());
			if(bro.size() == newList.size()) {
				answer++;
			}
		}
		System.out.println(answer);
		
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
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		int cnt = 0;
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		for (int i = 0; i < progresses.length; i++) {
			result = progresses[i];
			cnt = 0;
			while (result < 100) {
				result += speeds[i];
				cnt++;
			}

			if (i == 0) {
				stack.push(cnt);
			} else {
				if (stack.firstElement() >= cnt) {
					stack.push(cnt);
				} else {
					stack2.push(stack.size());
					stack.clear();
					stack.push(cnt);
				}
			}
		}
		stack2.push(stack.size());
		int[] answer = new int[stack2.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack2.get(i);
		}

	}

	public static void ex21() throws IOException {
		String s = "1111111";
		int sum = 0;
		int roop = 0;
		int[] answer = new int[2];
		while (!s.equals("1")) {
			int cnt = 0;
			if (s.contains("0")) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == '0') {
						cnt++;
					}
				}
			}
			sum += cnt;
			s = s.replace("0", "");
			s = Integer.toBinaryString(s.length());
			roop++;
		}
		answer[0] = roop;
		answer[1] = sum;
	}

	public static void ex22() throws IOException {
		// 86점
		int n = 110011;
		int k = 10;
		int max = 0;
		int answer = 0;

		String nd = "";
		String item = "";
		Stack<Character> stack = new Stack<Character>();
		while (n > 0) {// 진법이 되는 수를 나눈다.
			nd = (n % k) + nd;
			n /= k;
		}
		if (!nd.contains("0")) {
			answer = 0;
		} else {
			String[] arr = nd.split("0");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].length() > 0) {
					if (max < Integer.parseInt(arr[i])) {
						max = Integer.parseInt(arr[i]);
					}
				}
			}
			if (max != 0) {
				int[] arr2 = new int[max + 1];
				arr2[0] = arr2[1] = 1;
				for (int i = 2; i < arr2.length; i++) {
					if (arr2[i] == 0) {
						for (int j = i + i; j < arr2.length; j += i) {
							arr2[j] = 1;
						}
					}
				}

				for (int i = 0; i < nd.length(); i++) {
					if (nd.charAt(i) == '0') {
						item = "";
						for (int j = 0; j < stack.size(); j++) {
							if (stack.get(j) != '0') {
								item += stack.get(j);
							}
						}
						if (item != "") {
							if (arr2[Integer.parseInt(item)] == 0) {
								answer++;
							}
						}
						stack.clear();
						stack.push('0');
					} else
						stack.push(nd.charAt(i));
				}
				if (stack.size() != 1) {
					item = "";
					for (int j = 0; j < stack.size(); j++) {
						if (stack.get(j) != '0') {
							item += stack.get(j);
						}
					}
					if (arr2[Integer.parseInt(item)] == 0) {
						answer++;
					}
				}
			}

		}

		System.out.println(answer);
	}

	public static void ex23() throws IOException {
		int n = 2;
		String[] words = { "hello", "one", "even", "never", "now", "world", "draw" };
		int roop = 1;
		int turn = 1;
		int member = 2;
		ArrayList<String> list = new ArrayList<String>();
		int[] answer = new int[2];
		answer[0] = answer[1] = 0;

		list.add(words[0]);
		while (roop < words.length) {
			if (list.indexOf(words[roop]) == -1) {
				if (words[roop - 1].charAt(words[roop - 1].length() - 1) == words[roop].charAt(0)) {
					list.add(words[roop]);
				} else {
					answer[0] = member;
					answer[1] = turn;
					break;
				}
			} else {
				answer[0] = member;
				answer[1] = turn;
				break;
			}

			roop++;
			member++;
			if (member > n) {
				member = 1;
				turn++;
			}
		}

		System.out.println(answer[0] + " " + answer[1]);

	}

	public static void ex24() throws IOException {
		int rows = 100;
		int columns = 97;
		int[][] queries = { { 1, 1, 100, 97 } };
		int[][] squre = new int[rows][columns];
		int[][] squre2 = new int[rows][columns];
		int cnt = 1;
		int[] answer = new int[queries.length];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				squre[i][j] = cnt;
				squre2[i][j] = cnt;
				cnt++;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			int fr = queries[i][0] - 1; // 2
			int fy = queries[i][1] - 1; // 2
			int lr = queries[i][2] - 1; // 5
			int ly = queries[i][3] - 1;// 4
			int min = rows * columns + 1;
			// 가로
			for (int j = fy; j <= ly; j++) {
				if (j + 1 > ly) {
					squre2[fr + 1][j] = squre[fr][j];
				} else
					squre2[fr][j + 1] = squre[fr][j];
				if (min > squre[fr][j]) {
					min = squre[fr][j];
				}
			}
			// 세로
			for (int j = fr + 1; j <= lr; j++) {
				if (j + 1 > lr) {
					squre2[j][ly - 1] = squre[j][ly];
				} else
					squre2[j + 1][ly] = squre[j][ly];
				if (min > squre[j][ly]) {
					min = squre[j][ly];
				}
			}
			// 가로
			for (int j = ly - 1; j >= fy; j--) {
				if (j - 1 < fy) {
					squre2[lr - 1][j] = squre[lr][j];
				} else
					squre2[lr][j - 1] = squre[lr][j];

				if (min > squre[lr][j]) {
					min = squre[lr][j];
				}
			}
			// 세로
			for (int j = lr - 1; j > fr; j--) {
				squre2[j - 1][fy] = squre[j][fy];
				if (min > squre[j][fy]) {
					min = squre[j][fy];
				}
			}
			for (int j = 0; j < rows; j++) {
				for (int k = 0; k < columns; k++) {
					squre[j][k] = squre2[j][k];
				}
			}
			answer[i] = min;
		}

	}

	public static void ex25() throws IOException {
		int n = 8;
		int a = 4;
		int b = 5;
		int answer = 0;
		while (a != b) {
			if (a % 2 != 0) {
				a = a / 2 + 1;
			} else
				a = a / 2;

			if (b % 2 != 0) {
				b = b / 2 + 1;
			} else
				b = b / 2;
			answer++;
		}
		System.out.println(answer);
	}

	public static void ex26() throws IOException {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int answer = 0;
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {

				if (board[j][moves[i] - 1] != 0) {
					if (!stack.isEmpty()) {
						if (stack.peek() == board[j][moves[i] - 1]) {
							stack.pop();
							answer += 2;
						} else
							stack.push(board[j][moves[i] - 1]);
					} else
						stack.push(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}
	}

	public static void ex27() throws IOException {

		int n = 15;
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			int sum = i;
			for (int j = i + 1; j <= n; j++) {
				sum += j;
				if (sum == n) {
					cnt++;
				} else if (sum > n) {
					break;
				}
			}
		}
		System.out.println(cnt + 1);

	}

	public static void ex28() throws IOException {

		int n = 3;
		long left = 2;
		long right = 5;
		long calc = right - left + 1;
		long cnt = 0;
		long roop = 0;
		int[] answer = new int[(int) calc];
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[j][i] = i + 1;

			}
			for (int j = 0; j <= i; j++) {
				arr[i][j] = i + 1;

			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (cnt >= left && cnt <= right) {
					answer[(int) roop] = arr[i][j];
					roop++;
				}
				cnt++;
			}

		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

	public static void ex29() throws IOException {

		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		int cnt = 0;
		for (int i = 0; i < record.length; i++) {
			String[] arr = record[i].split(" ");

			if (arr[0].equals("Enter")) {
				map.put(arr[1], arr[2]);
				if (map2.containsKey(arr[1])) {
					map2.put(arr[1], arr[2]);
				}
				cnt++;
			} else if (arr[0].equals("Leave")) {
				map2.put(arr[1], map.get(arr[1]));
				map.put(arr[1], "");
				cnt++;
			} else {
				map.put(arr[1], arr[2]);
				if (map2.containsKey(arr[1])) {
					map2.put(arr[1], arr[2]);
				}
			}
		}

		String[] answer = new String[cnt];
		cnt = 0;
		for (int i = 0; i < record.length; i++) {
			String[] arr = record[i].split(" ");
			if (arr[0].equals("Enter")) {
				if (!map.get(arr[1]).equals("")) {
					answer[cnt] = map.get(arr[1]) + "님이 들어왔습니다.";
				} else {
					answer[cnt] = map2.get(arr[1]) + "님이 들어왔습니다.";
				}

				cnt++;
			} else if (arr[0].equals("Leave")) {
				answer[cnt] = map2.get(arr[1]) + "님이 나갔습니다.";
				cnt++;
			}
		}
	}

	public static void ex30() throws IOException {
		String s = "{{123}}";
		ArrayList<String> list = new ArrayList<String>();
		s = s.replace("{{", "");
		s = s.replaceAll("}}", "");
		if (s.contains("},{")) {
			s = s.replace("},{", " ");
		}
		String[] arr = s.split(" ");
		int[] answer = new int[arr.length];
		int cnt = 0;
		while (cnt < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				String[] arr2 = arr[i].split(",");
				if (arr2.length == cnt + 1) {
					for (int j = 0; j < arr2.length; j++) {
						if (list.indexOf(arr2[j]) == -1) {
							list.add(arr2[j]);
						}
					}
					cnt++;
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
			System.out.println(answer[i]);
		}

	}

	public static void ex31() throws IOException {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		int answer = 0;
		Queue<Integer> que = new LinkedList<Integer>();
		Queue<Integer> queIndex = new LinkedList<Integer>();

		for (int i = 0; i < priorities.length; i++) {
			que.offer(priorities[i]);
			if (i == location) {
				queIndex.offer(1);
			} else {
				queIndex.offer(0);
			}
		}
		Arrays.sort(priorities);
		int cnt = priorities.length - 1;
		while (true) {
			if (que.peek() == priorities[cnt]) {
				que.poll();
				if (queIndex.peek() == 1) {
					answer++;
					break;
				}
				queIndex.poll();
				answer++;
				cnt--;
			} else {
				que.offer(que.poll());
				queIndex.offer(queIndex.poll());
			}

		}

	}
	
	public static void ex32() throws IOException {
		String X ="12321";
		String answer = "";
		String Y="42531";
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		String [] arrX = X.split("");
		String [] arrY = Y.split("");
		int cnt=0;
		int sum = 0;
		for(int i = 0; i<arrY.length; i++) {
			list.add(arrY[i]);
		}
		for(int i=0; i<arrX.length; i++) {
			if(list.contains(arrX[i])) {
				list.remove(arrX[i]);
				list2.add(arrX[i]);
				cnt++;
				sum+=Integer.parseInt(arrX[i]);
			}
		}
		
		
		if(cnt==0) {
			answer ="-1";
		}else if(cnt!=0&& sum==0) {
			answer ="0";
		}else {
			Collections.sort(list2, Collections.reverseOrder());
			answer = String.join("", list2);
		}
	
		
	}

	public static void ex33() throws IOException {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1}; 
		String[] discount= {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		int answer = 0;

		
		for(int i=0; i<=discount.length-10; i++) {
			String[] arr = new String[10];
			int flag = 1;
			for(int j=0; j<10; j++) {
				arr[j] = discount[j+i];
			}
			for(int j=0; j<want.length; j++) {
				if(Collections.frequency(Arrays.asList(arr), want[j]) != number[j]) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				answer++;
			}
		
		}
		System.out.println(answer);
		
	}
	
	public static void ex34() throws IOException {
	
		int[] order = {5,4,3,2,1};
		int [] send = new int[order.length];
		ArrayList<String> list = new ArrayList<String>();
		for(int i=1; i<=send.length; i++) {
			send[i-1] = i;
			list.add(Integer.toString(i) );
		}
		
		Stack<Integer> main = new Stack<Integer>();
		Stack<Integer> sub = new Stack<Integer>();
		int answer = 0;
		for(int i=0; i<order.length; i++) {
			if(i==0) {
				for(int j=0; j<send.length; j++) {
					if(order[i] !=send[j]) {
						sub.push(send[j]);
						list.remove(Integer.toString(send[j]));
					}else {
						list.remove(Integer.toString(order[i]));
						answer++;
						break;
					}
				}
			}else {
				
				if(!list.isEmpty()&& order[i] ==Integer.parseInt(list.get(0)) ) {
					int num = Integer.parseInt(list.get(0));
					answer++;
					list.remove(Integer.toString(num));
					
				}else if(!sub.isEmpty() && sub.peek() == order[i]) {
					answer++;
					sub.pop();
				}else {
					break;
				}
				
			}

		}
		System.out.println(answer);
		
	}
}
