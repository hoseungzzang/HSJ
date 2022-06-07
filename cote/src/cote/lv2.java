package cote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lv2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		while(roop!=0) {
			int cnt=0;
			int [] arr2 = new int[(roop*2)+1];
			arr2[0] = arr2[1] = 1;
			for(int i = 0; i<=(roop*2); i++) {
				if(arr2[i]==0) {
					if(i>roop) {
						cnt++;
					}
					for(int j=i+i; j<=(roop*2);j+=i) {
						arr2[j]=1;
					}
				}
				
			}
			 roop = Integer.parseInt(br.readLine());
			 bw.write(cnt+"\n");
		}
		
		bw.flush();
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
		//시간계산
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
		//정렬,카운팅,
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int roop = str.countTokens();
		int [] arr = new int[roop];
		int [] count = new int[roop];
		int big = 0;
		int sum=0;
		for(int i=0; i<roop; i++){
			arr[i] = Integer.parseInt(str.nextToken());
			if(big<arr[i]) {
				big=arr[i];
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length;i++) {
			if(list.indexOf(arr[i])==-1) {
				list.add(arr[i]);
				count[i]++;
			}
			else count[list.indexOf(arr[i])]++;
		}
		int max=0;
		int index=0;
		for(int i=0; i<arr.length;i++) {
			if(count[i]>max) {
				max = count[i];
				index = i;
			}
		}
		if(max==3) {
			sum = 10000+arr[index]*1000;
		}
		else if(max==2) {
			sum = 1000+arr[index]*100;
		}
		else sum = big*100;
		bw.write(sum+"");
		bw.flush();
	}
	public static void ex5() throws IOException {
		//방무계산
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(str.nextToken());
		double b =  Double.parseDouble(str.nextToken());
		double sum = a-(a* b/100);
		
		if(sum>=100) {
			bw.write(0+"");
		}else bw.write(1+"");
		
		bw.flush();
	}
	public static void ex6() throws IOException {
		//소수개수구하기 에라토스테네스의 채 구현
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int roop = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int max =0;
		int cnt=0;
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<roop;i++) {
			arr.add(Integer.parseInt(str.nextToken()));
			if(arr.get(i)>max) {
				max=arr.get(i);
			}
		}
		int [] arr2 = new int[max+1];
		arr2[0] = arr2[1] = 1;
		for(int i = 0; i<=max; i++) {
			if(arr2[i]==0) {
				if(arr.indexOf(i)!=-1) {
					cnt++;
				}
				for(int j=i+i; j<=max;j+=i) {
					arr2[j]=1;
				}
			}
			
		}
		bw.write(cnt+"");
		
		bw.flush();
	}
	public static void ex7() throws IOException {
		//소수구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		while(roop!=0) {
			int cnt=0;
			int [] arr2 = new int[(roop*2)+1];
			arr2[0] = arr2[1] = 1;
			for(int i = 0; i<=(roop*2); i++) {
				if(arr2[i]==0) {
					if(i>roop) {
						cnt++;
					}
					for(int j=i+i; j<=(roop*2);j+=i) {
						arr2[j]=1;
					}
				}
				
			}
			 roop = Integer.parseInt(br.readLine());
			 bw.write(cnt+"\n");
		}
		
		bw.flush();
	}

}
