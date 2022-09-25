package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num2470 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int [] arr = new int[n];
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		Arrays.sort(arr);
		int lp=0;
		int rp = arr.length-1;
		int answer1=0;
		int answer2=0;
		long max = Long.MAX_VALUE;
		while(lp<rp) {
			long num = arr[lp] + arr[rp];
			if(max>Math.abs(num)) {
				answer1= arr[lp];
				answer2=arr[rp];
				max=Math.abs(num);
			}
			if(num>0) {
				rp--;
			}
			else {
				lp++;
			}
		
			
		}
		System.out.println(answer1+" "+answer2);
		
	}
	
}




