package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class num1450 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int c =  Integer.parseInt(str.nextToken());
		int [] arr = new int[n];
		str = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		int cnt =1;
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			if(start ==end ) {
				if(arr[start]<=c) {
					cnt++;
				}
				break;
			}else {
				if(arr[start]<=c) {
					cnt++;
				}
				if(arr[end]<=c) {
					cnt++;
				}
				if(arr[start]+arr[end]<=c) {
					cnt++;
				}
				start++;
				end--;
			}
		}
		System.out.println(cnt);
		bw.flush();
		
	}
	
}




