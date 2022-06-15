package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] x = new int[3];
		int [] y = new int[3];
		for(int i=0; i<3; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(str.nextToken());
			y[i] = Integer.parseInt(str.nextToken());
		}
	

		
	
		bw.flush();

	}

	public static void ex1() throws IOException {
		// 占쏙옙占쏙옙 占쏙옙占쏙옙占신쏙옙占�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(str.nextToken());
		int max = Integer.parseInt(str.nextToken());
		str = new StringTokenizer(br.readLine());
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(str.nextToken());

		}
		int sum = 0;
		int answer = 0;
		int calc = max;
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (j == num - 1) {
					break;
				}
				for (int k = j + 1; k < num; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (max - sum >= 0 && max - sum < calc) {
						calc = max - sum;
						answer = sum;
					}
				}
			}
		}
		System.out.println(answer);
	}

	public static void ex2() throws IOException {
		// 占쏙옙占쏙옙占쏙옙
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str = new StringTokenizer(br.readLine());

		String num = str.nextToken();
		int min = num.length() * 9;
		int max = Integer.parseInt(num);
		int sum = 0;
		int index = max - min;
		if (max <= 8) {
			index = 0;
		}
		for (int i = index; i < max; i++) {
			sum = 0;
			String arr = Integer.toString(i);
			for (int j = 0; j < arr.length(); j++) {
				sum += arr.charAt(j) - '0';
			}
			sum += i;
			if (sum == max) {
				bw.write(i + "");
				sum = 1;
				break;
			}
		}
		if (sum != 1) {
			bw.write(0 + "");
		}
		bw.flush();

	}

	public static void ex3() throws IOException {
		// 占쏙옙占쏙옙 2nlogn
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		int[] arr = new int[roop];
		for (int i = 0; i < roop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for (int i = 0; i < roop; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();

	}

	public static void ex4() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int[] arr = new int[roop];
		int[] count = new int[roop];
		int[] choiarr = {};
		int sum = 0;
		for (int i = 0; i < roop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			if (list.indexOf(arr[i]) == -1) {
				list.add(arr[i]);
				count[i]++;
			} else {
				count[list.indexOf(arr[i])]++;
			}
		}
		int choi = Arrays.stream(count).max().getAsInt();

		double calc = (double) sum / roop;// 占쏙옙占쏙옙占쏙옙
		String s = String.format("%.0f", calc);
		if (s.equals("-0")) {
			s = "0";
		}
		bw.write(s + "\n");
		if (roop > 1) {
			for (int i = 0; i < roop; i++) {
				if (count[i] == choi) {
					list2.add(arr[i]);
				}
			}
			if (list2.size() > 1) {
				choiarr = new int[list2.size()];
				for (int i = 0; i < choiarr.length; i++) {
					choiarr[i] = list2.get(i);
				}
				Arrays.sort(choiarr);
				choi = choiarr[1];
			} else
				choi = list2.get(0);

			Arrays.sort(arr);
			int middle = arr[roop / 2];
			int beom = arr[roop - 1] - arr[0];
			bw.write(middle + "\n" + choi + "\n" + beom);
		} else {
			bw.write(arr[0] + "\n" + arr[0] + "\n" + "0");
		}
		bw.flush();

	}

	public static void ex5() throws IOException {
		// 占쏙옙占쏙옙
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long num = Long.parseLong(bf.readLine());
		long cnt = 0;
		int sum = 1;
		if (num == 1) {
			bw.write(1 + "");
		} else {
			while (true) {
				if (num > sum) {
					cnt++;
					sum += 6 * cnt;
				} else {
					bw.write((cnt + 1) + "");
					break;
				}
			}
		}

		bw.flush();

	}

	public static void ex6() throws IOException {
		// 10250占쏙옙 占쏙옙占쏙옙
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(bf.readLine());
		for (int i = 0; i < roop; i++) {
			StringTokenizer str = new StringTokenizer(bf.readLine());
			int h = Integer.parseInt(str.nextToken());
			int w = Integer.parseInt(str.nextToken());
			int n = Integer.parseInt(str.nextToken());
			int calc = n % h;
			int calc2 = n / h + 1;
			if (n % h == 0) {
				calc = h;
				calc2 = n / h;
			}
			int sum = (100 * calc + calc2);
			bw.write(sum + "\n");
		}
		bw.flush();

	}

	public static void ex7() throws IOException {
		// 부녀회장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());

		for (int i = 0; i < roop; i++) {
			int ho = 0;
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[k + 1][n];
			for (int j = 0; j < n; j++) {
				arr[0][j] = j + 1;
			}
			for (int j = 1; j <= k; j++) {
				ho = 0;
				for (int m = 0; m < n; m++) {
					ho = 0;
					for (int z = 0; z <= m; z++) {
						ho += arr[j - 1][z];
					}
					arr[j][m] = ho;
				}
			}
			bw.write(arr[k][n - 1] + "\n");
		}

		bw.flush();

	}

	public static void ex8() throws IOException {
		// 소수판별
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		int[] arr = new int[num2 + 1];
		arr[0] = arr[1] = 1;
		for (int i = 2; i <= num2; i++) {
			if (arr[i] == 0) {
				for (int j = i + i; j <= num2; j += i) {
					arr[j] = 1;
				}
			}
		}
		int sum = 0;
		int cnt = 0;
		int min = 0;
		for (int i = num1; i <= num2; i++) {
			if (arr[i] == 0) {
				sum += i;
				if (cnt == 0) {
					min = i;
				}
				cnt++;
			}
		}
		if (cnt == 0) {
			bw.write(-1 + "");
		} else
			bw.write(sum + "\n" + min);
		bw.flush();

	}

	public static void ex9() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num2 = Integer.parseInt(br.readLine());
		int n = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (num2 != 1) {
			for (int i = 2; i <= num2; i++) {
				if (num2 % i == 0) {
					list.add(i);
					n = i;
					break;
				}

			}
			num2 /= n;
		}

		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		bw.flush();

	}

	public static void ex10() throws IOException {
		// 골드바흐추측
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for (int z = 0; z < roop; z++) {
			int num2 = Integer.parseInt(br.readLine());
			int[] arr = new int[num2 + 1];
			arr[0] = arr[1] = 1;
			for (int i = 2; i <= num2; i++) {
				if (arr[i] == 0) {
					for (int j = i + i; j <= num2; j += i) {
						arr[j] = 1;
					}
				}
			}
			int num = 0;
			for (int i = 2; i <= num2 / 2; i++) {
				if (arr[i] == 0 && arr[num2 - i] == 0) {
					num = i;
				}
			}
			bw.write(Integer.min(num, num2 - num) + " " + Integer.max(num, num2 - num) + "\n");
		}
		bw.flush();

	}

	public static void ex11() throws IOException {
		// 재귀기초
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int[] roop = new int[num + 1];
		int cnt = 2;
		if (num == 1) {
			System.out.println(1);
		} else if (num == 0) {
			System.out.println(0);
		} else {
			roop[0] = 0;
			roop[1] = 1;
			// re(roop,cnt,num);
		}

	}

	public static void ex12() throws IOException {
		// 정렬기초
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		String[] sbb = s.split("");
		Arrays.sort(sbb);
		s = String.join("", sbb);
		StringBuffer sb = new StringBuffer(s);
		bw.write(sb.reverse() + "");
		bw.flush();

	}

	public static void ex13() throws IOException {
		// 셀프넘버
		/*
		 * static int [] arr = new int[10000]; BufferedWriter bw = new
		 * BufferedWriter(new OutputStreamWriter(System.out)); int cnt=1; arr[0] = 1;
		 * arr[11]=1; int sum=0; while(cnt<10000) { sum=re(cnt); cnt++; }
		 * 
		 * for(int i=0; i<arr.length; i++) { if(arr[i]==0) { bw.write(i+"\n"); }
		 * 
		 * }
		 */
		/*
		 * 함수 String s = Integer.toString(cnt); int sum=cnt; for(int i=0;
		 * i<s.length();i++) { sum+=s.charAt(i)-'0'; } if(sum<10000) { arr[sum] = 1; }
		 * return sum;
		 */
		// bw.flush();

	}
	public static void ex14() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		for (int i = 0; i < roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			BigInteger big1 = new BigInteger(str.nextToken());
			BigInteger big2 = new BigInteger(str.nextToken());
			int be = big1.gcd(big2).intValue();
			bw.write((big1.intValue() * big2.intValue()) / be + "\n");
		}
		bw.flush();

	}
	public static void ex15() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(str.nextToken());
		int y = Integer.parseInt(str.nextToken());
		int w = Integer.parseInt(str.nextToken());
		int h = Integer.parseInt(str.nextToken());
	
		bw.write(Integer.min(Integer.min(w-x, x),Integer.min(h-y,y))+"");
		
		bw.flush();

	}
}
