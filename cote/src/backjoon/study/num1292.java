package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num1292 {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(str.nextToken());
		int b=  Integer.parseInt(str.nextToken());
		int [] arr = new int[10000001];
		int cnt = 1;
		boolean flag = false;
		int sum = 0;
		for(int i=1; i<1000; i++) {
			for(int j=0;j<i;j++) {
				arr[cnt] = i;
				cnt++;
				if(cnt>b) {
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		for(int i=a; i<=b; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
	
}




