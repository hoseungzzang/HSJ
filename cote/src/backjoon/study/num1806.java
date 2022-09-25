package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num1806 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int s = Integer.parseInt(str.nextToken());
		int [] arr = new int[n];
		int 	calc =0;
		str = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
			calc+=arr[i];
		}
		
			Arrays.sort(arr);
			int lp=0;
			int rp=lp;
			
			int len = Integer.MAX_VALUE;
			int sum = 0;
			while(lp<n) {
				int cnt=0;
				sum = arr[lp];
				for(int i=lp+1; i<n; i++) {
					sum+=arr[i];
					cnt++;
					if(sum>=s) {
						len = Integer.min(len,cnt);
					}
				}
			
			System.out.println(len);
		}
	
		
	}
	
}




