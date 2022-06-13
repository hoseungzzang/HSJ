package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(bf.readLine());
		for(int i=0; i<roop;i++){
			StringTokenizer str = new StringTokenizer(bf.readLine());
			int h = Integer.parseInt(str.nextToken());
			int w = Integer.parseInt(str.nextToken());
			int n = Integer.parseInt(str.nextToken());
			int calc=n%h;
			int calc2= n/h+1;
			if(n%h==0) {
				calc=h;
				calc2=n/h;
			}
			int sum = (100*calc+calc2);
			bw.write(sum+"\n");
		}
		bw.flush();
		
		
	}

	public static void ex1() throws IOException {
		// 블랙잭 모든경우탐색
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
		// 분해합
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
		// 정렬 2nlogn
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
		int sum =0;
		for(int i=0; i<roop; i++) {
			arr[i]  = Integer.parseInt(br.readLine());
			sum+=arr[i];
			if(list.indexOf(arr[i])==-1) {
				list.add(arr[i]);
				count[i]++;
			}else {
				count[list.indexOf(arr[i])]++;
			}
		}
		int choi= Arrays.stream(count).max().getAsInt();
		
		double calc = (double)sum/roop;//산술평균
		String s= String.format("%.0f",calc);
		if(s.equals("-0")) {
			s="0";
		}
		bw.write(s+"\n");
		if(roop>1) {
			for(int i=0; i<roop; i++) {
				if(count[i]==choi) {
					list2.add(arr[i]);
				}
			}
			if(list2.size()>1) {
				choiarr = new int[list2.size()];
				for(int i=0; i<choiarr.length;i++) {
					choiarr[i] = list2.get(i);
				}
				Arrays.sort(choiarr);
				choi = choiarr[1];
			}
			else choi = list2.get(0);
			
			Arrays.sort(arr);
			int middle = arr[roop/2];
			int beom = arr[roop-1]-arr[0];
			bw.write(middle+"\n"+choi+"\n"+beom);
		}else {
			bw.write(arr[0]+"\n"+arr[0]+"\n"+"0");
		}
		bw.flush();
		
	}
	public static void ex5() throws IOException {
		//벌집
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long num = Long.parseLong(bf.readLine());
		long cnt=0;
		int sum = 1;
		if(num==1) {
			bw.write(1+"");
		}
		else {
			while(true) {
				if(num >sum) {
					cnt++;
					sum+= 6*cnt;
				}else {
					bw.write((cnt+1)+"");
					break;
				}
			}
		}
		
		bw.flush();
		
	}
	public static void ex6() throws IOException {
		//10250번 백준
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(bf.readLine());
		for(int i=0; i<roop;i++){
			StringTokenizer str = new StringTokenizer(bf.readLine());
			int h = Integer.parseInt(str.nextToken());
			int w = Integer.parseInt(str.nextToken());
			int n = Integer.parseInt(str.nextToken());
			int calc=n%h;
			int calc2= n/h+1;
			if(n%h==0) {
				calc=h;
				calc2=n/h;
			}
			int sum = (100*calc+calc2);
			bw.write(sum+"\n");
		}
		bw.flush();
		
		
	}
	

}
