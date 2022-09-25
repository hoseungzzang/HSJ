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
		int[] arr = new int[n];
		str = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		int sum=0;
		int lp = 0;
		int len = Integer.MAX_VALUE;
		int rp = 0;
		int cnt=0;
		while (lp < n ) {
			if(sum>=s) {
				len = Integer.min(cnt,len);
				sum-=arr[lp];
				lp++;
				cnt--;
			}else if(rp<n){
				sum+=arr[rp];
				cnt++;
				rp++;
			}else {
				break;
			}
		}
		if(len == Integer.MAX_VALUE) {
			System.out.println(0);
		}else {
			System.out.println(len);
		}
		
	}

}
