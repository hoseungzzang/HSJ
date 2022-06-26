package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer str = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(str.nextToken());
		int num2 = Integer.parseInt(str.nextToken());
		for(int i=1; i<=num1; i++) {
			for(int j=1;j<=num2;j++) {
				System.out.println(i+" "+(j+i));
			}
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

		bw.write(Integer.min(Integer.min(w - x, x), Integer.min(h - y, y)) + "");

		bw.flush();

	}

	public static void ex16() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int[] arr = new int[3];
			StringTokenizer str = new StringTokenizer(br.readLine());
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(str.nextToken());
				sum += arr[i];
			}
			if (sum == 0) {
				break;
			}
			Arrays.sort(arr);
			if (arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
				bw.write("right\n");
			} else
				bw.write("wrong\n");
		}

		bw.flush();
	}

	public static void ex17() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for (int i = 0; i < 3; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(str.nextToken());
			int num2 = Integer.parseInt(str.nextToken());
			if (!map1.containsKey(num1)) {
				map1.put(num1, 1);
			} else
				map1.put(num1, map1.get(num1) + 1);
			if (!map2.containsKey(num2)) {
				map2.put(num2, 1);
			} else
				map2.put(num2, map2.get(num2) + 1);
		}
		for (int key : map1.keySet()) {
			int value = map1.get(key);
			if (value == 1) {
				bw.write(key + " ");
			}
		}

		for (int key : map2.keySet()) {
			int value = map2.get(key);
			if (value == 1) {
				bw.write(key + "");
			}
		}

		bw.flush();
	}

	public static void ex18() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long x = Integer.parseInt(br.readLine());
		double pi = 3.14;
		double calc1 = (x * x) * Math.PI;
		double calc2 = (x * x) * 2;
		String a = String.format("%.6f", calc1);
		String b = String.format("%.6f", calc2);
		bw.write(a + "\n" + b);
		bw.flush();
	}

	public static void ex19() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		Map<String, Integer> map = new HashMap<String, Integer>();
		int cnt = 0;
		for (int i = 0; i < d; i++) {
			map.put(br.readLine(), 1);
		}
		for (int i = 0; i < b; i++) {
			String s = br.readLine();
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
				cnt++;
			}
		}
		Map<String, Integer> sortedMap = new TreeMap<>(map);
		bw.write(cnt + "\n");
		for (String key : sortedMap.keySet()) {
			int value = sortedMap.get(key);
			if (value == 2) {
				bw.write(key + "\n");
			}
		}
		bw.flush();
	}

	public static void ex20() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int d = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			if (d == 0 && b == 0)
				break;
			if (d > b) {
				if (d % b != 0) {
					bw.write("neither\n");
				} else
					bw.write("multiple\n");
			} else {
				if (b % d != 0) {
					bw.write("neither\n");
				} else
					bw.write("factor\n");
			}
		}

		bw.flush();
	}

	public static void ex21() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		String[][] arr = new String[roop][2];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(str.nextToken());
			arr[i][0] = Integer.toString(num);
			arr[i][1] = str.nextToken();
			if (list.indexOf(num) == -1) {
				list.add(num);
			}
		}
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (list.get(i) == Integer.parseInt(arr[j][0])) {
					bw.write(arr[j][0] + " " + arr[j][1] + "\n");
				}
			}
		}

		bw.flush();
	}

	public static void ex22() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int roop = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int[] arr = new int[roop];
		for (int i = 0; i < roop; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		for (int i = 1; i < roop; i++) {
			if (arr[0] % arr[i] == 0) {
				bw.write((arr[0] / arr[i]) + "/1\n");
			} else {
				int swap = 0;
				int num1 = arr[0];
				int num2 = arr[i];
				while (num2 != 0) {
					swap = num1 % num2;// 4
					num1 = num2;//
					num2 = swap;
				}
				bw.write((arr[0] / num1) + "/" + (arr[i] / num1) + "\n");
			}
		}

		bw.flush();
	}
	public static void ex23() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine();
		BigInteger big1 = new BigInteger(num);
		long cnt = 0;
		BigInteger big2 = new BigInteger("1");
		long result = 0;
		while (true) {
			if (big1.subtract(BigInteger.valueOf(cnt)).intValue() == 0) {
				break;
			}
			big2 = big2.multiply(big1.subtract(BigInteger.valueOf(cnt)));
			cnt++;
		}

		String[] arr = big2.toString().split("");

		for (int i = arr.length - 1; i >= 0; i--) {
			if (!arr[i].equals("0")) {
				break;
			} else
				result++;
		}
		bw.write(result + "");
		bw.flush();
	}
	public static void ex24() throws IOException {
		//수정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int [][] arr = new int[num][2];
		for(int i=0; i<arr.length; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(str.nextToken());
			arr[i][1] = Integer.parseInt(str.nextToken());
		}
		Arrays.sort(arr, (o1,o2)->{
		  
		    	 if(o1[1] == o2[1]) {
	                 return o1[0] - o2[0];
		    	 }else {
		    		 return o1[1] - o2[1]; 
		    	 }
	           
	        });
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.flush();

	}
	public static void ex25() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int [] arr = new int[roop];
		int sum=0;
		for(int i=0; i<roop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],1);
			}else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		//산술평균
		String num = String.format("%.0f",(double)sum/roop);
		if(num.contains("-0")) {
			num = num.replace("-","");
		}
		bw.write(num+"\n");
		Arrays.sort(arr);
		//중앙ㄱ밧
		bw.write(arr[roop/2]+"\n");
		int max= Collections.max(map.values());
		for(int key : map.keySet()) {
			int value = map.get(key);
			if (value == max) {
				list.add(key);
			}
		}
		//최빈값
		if(list.size()!=1) {
			Collections.sort(list);
			bw.write(list.get(1)+"\n");
		}else bw.write(list.get(0)+"\n");
		
		//범위
		bw.write((arr[arr.length-1]-arr[0])+"");
		bw.flush();

	}
	public static void ex26() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int cnt=0;
		int [] arr = new int[roop];
		int [] count = new int[roop];
		for(int i=0; i<roop; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
			count[i] = arr[i];
		}
		Arrays.sort(count);
		for(int i=0; i<count.length; i++) {
			if(!map.containsKey(count[i])) {
				map.put(count[i],cnt);
				cnt++;
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			bw.write(map.get(arr[i])+" ");
		}
		bw.flush();

	}
	public static void ex27() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i =0; i<roop; i++) {
			map1.put(Integer.parseInt(str.nextToken()),0);
		}
		 roop = Integer.parseInt(br.readLine());
		 str = new StringTokenizer(br.readLine());
		 for(int i =0; i<roop; i++) {
			 	int num =  Integer.parseInt(str.nextToken());
			 	if(map1.containsKey(num)) {
			 		bw.write(1+" ");
			 	}else bw.write(0+" ");
			}
		bw.flush();

	}
	public static void ex28() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int roop = Integer.parseInt(str.nextToken());
		int quiz = Integer.parseInt(str.nextToken());
		Map<String,String> map1 = new HashMap<String,String>();
		Map<String,String> map2 = new HashMap<String,String>();
		
		for(int i =0; i<roop; i++) {
			String poke = br.readLine();
			map1.put(Integer.toString(i+1),poke);
			map2.put(poke,Integer.toString(i+1));
		}
		for(int i=0; i<quiz; i++) {
			String gubun = br.readLine();
			if(gubun.matches("^[0-9]*$")) {
				bw.write(map1.get(gubun)+"\n");
			}else {
				bw.write(map2.get(gubun)+"\n");
			}
		}
		bw.flush();

	}
	public static void ex29() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int roop = Integer.parseInt(str.nextToken());
		int quiz = Integer.parseInt(str.nextToken());
		Map<String,String> map1 = new HashMap<String,String>();
		Map<String,String> map2 = new HashMap<String,String>();
		
		for(int i =0; i<roop; i++) {
			String poke = br.readLine();
			map1.put(Integer.toString(i+1),poke);
			map2.put(poke,Integer.toString(i+1));
		}
		for(int i=0; i<quiz; i++) {
			String gubun = br.readLine();
			if(gubun.matches("^[0-9]*$")) {
				bw.write(map1.get(gubun)+"\n");
			}else {
				bw.write(map2.get(gubun)+"\n");
			}
		}
		bw.flush();

	}
public static void ex30() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	

	StringTokenizer str = new StringTokenizer(br.readLine());
	int roop1 = Integer.parseInt(str.nextToken());
	int roop2 = Integer.parseInt(str.nextToken());
	str = new StringTokenizer(br.readLine());
	Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
	int amb=0;
	int bma=0;
	for(int i =0; i<roop1; i++) {
		int poke = Integer.parseInt(str.nextToken());
		map1.put(poke,0);
	}
	str = new StringTokenizer(br.readLine());
	for(int i =0; i<roop2; i++) {
		int poke = Integer.parseInt(str.nextToken());
		if(!map1.containsKey(poke)) {
			bma++; //b-a
		}else amb++;
	}
	bw.write((bma+(roop1-amb))+"");
	
	bw.flush();

}
public static void ex31() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Map<String,String> map = new HashMap<String,String>();
	String m = "";
	String s = br.readLine();
	int cnt=1;
	int result=0;
	while(cnt<=s.length()) {
		for(int i=0; i<=s.length()-cnt; i++ ) {
		m = s.substring(i,i+cnt);
		if(!map.containsKey(m)) {
			map.put(m, "");
			result++;
		}
		}
		cnt++;
	}
	
	bw.write(result+"");
	bw.flush();
}
public static void ex32() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int roop = Integer.parseInt(br.readLine());
	int [] arr1 = new int[roop];
	int [] arr2 = new int[roop];
	int sum=0;
	StringTokenizer str = new StringTokenizer(br.readLine());
	for(int i=0; i<roop; i++) {
		arr1[i] = Integer.parseInt(str.nextToken());
	}
	str = new StringTokenizer(br.readLine());
	for(int i=0; i<roop; i++) {
		arr2[i] = Integer.parseInt(str.nextToken());
	}
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	for(int i=0; i<roop; i++) {
		sum += arr1[i]*arr2[roop-1-i];
	}
	bw.write(sum+"");
	bw.flush();
}
public static void ex33() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Stack<Integer> stack = new Stack<Integer>();
	int roop = Integer.parseInt(br.readLine());
	String [] arr = new String[2];
	for(int i=0; i<roop; i++) {
		String s = br.readLine();
		if(s.contains("push")) {
			arr = s.split(" ");
			stack.push(Integer.parseInt(arr[1]));
		}else {
			if(s.equals("top")) {
				if(stack.isEmpty()) {
					bw.write(-1+"\n");
				}else bw.write(stack.peek()+"\n");
			}
			if(s.equals("size")) {
				bw.write(stack.size()+"\n");
			}
			if(s.equals("empty")) {
				if(stack.isEmpty()) {
					bw.write(1+"\n");
				}else bw.write(0+"\n");
			}
			if(s.equals("pop")) {
				if(stack.isEmpty()) {
					bw.write(-1+"\n");
				}else bw.write(stack.pop()+"\n");
			}
		}
		}
	
	bw.flush();
}
public static void ex34() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int roop = Integer.parseInt(br.readLine());
	
	
	for(int i=0; i<roop; i++) {
		String result = "NO";
		String s = br.readLine();
		int cnt=0;
		if(s.charAt(0)==')' || s.charAt(s.length()-1)=='(' || s.length()%2!=0) {
			bw.write("NO\n");
		}
		else {
			int roop2 = s.length()/2;
			while(cnt<roop2) {
				s=s.replace("()","");
				if(s.length()==0) {
					result = "YES";
					break;
				}
				cnt++;
			}
			bw.write(result+"\n");
		}
		
	}
	
	bw.flush();
}
public static void ex35() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int roop = Integer.parseInt(br.readLine());
	int cnt=0;
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	int [] arr=  new int [roop];
	StringTokenizer str = new StringTokenizer(br.readLine());
	for(int i=0; i<roop; i++) {
		arr[i] = Integer.parseInt(str.nextToken());
		map.put(arr[i],0);
	}
	int num = Integer.parseInt(br.readLine());
	for(int i=0; i<roop; i++) {
		int calc = num - arr[i] ;
	if(map.containsKey(calc)) {
		cnt++;
	}
	}
	bw.write((cnt/2)+"");
	
	bw.flush();
}
public static void ex36() throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int roop = Integer.parseInt(br.readLine());
	int cnt=0;
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	int [] arr=  new int [roop];
	StringTokenizer str = new StringTokenizer(br.readLine());
	for(int i=0; i<roop; i++) {
		arr[i] = Integer.parseInt(str.nextToken());
		map.put(arr[i],0);
	}
	int num = Integer.parseInt(br.readLine());
	for(int i=0; i<roop; i++) {
		int calc = num - arr[i] ;
	if(map.containsKey(calc)) {
		cnt++;
	}
	}
	bw.write((cnt/2)+"");
	
	bw.flush();
}
}
