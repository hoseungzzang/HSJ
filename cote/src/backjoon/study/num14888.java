package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num14888 {
		static int [] g;
		static boolean check[];
		static int min = Integer.MAX_VALUE;
		static int  max = Integer.MIN_VALUE;
		static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 n = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int [] arr = new int[n];
		check = new boolean[n];
		check[0] = true;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		str = new StringTokenizer(br.readLine());
		g = new int[4];
		g[0] = Integer.parseInt(str.nextToken()); g[1] = Integer.parseInt(str.nextToken()); g[2] = Integer.parseInt(str.nextToken()); g[3] = Integer.parseInt(str.nextToken());
		DFS(arr,1,arr[0]);
		System.out.println(max + "\n" + min);
		
	}
	public static void DFS(int [] arr,int index,int sum) {
		if(index == n) {
			min = Math.min(min, sum);
			max = Math.max(max, sum);
			return;
		}
				for(int j=0; j<4; j++) {
					if(g[j]>0) {
						g[j]--;
						switch (j) {
				         case 0: 	DFS(arr,index+1,sum+arr[index]);
				                  break;
				         case 1:  DFS(arr,index+1,sum-arr[index]);
				                  break;
				         case 2:  DFS(arr,index+1,sum*arr[index]);
				                  break;
				         case 3:  DFS(arr,index+1,sum/arr[index]);
				         		break;
						 }
						g[j]++;
					}
				}
				
			
		
	}
}




