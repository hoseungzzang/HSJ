package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class num2309 {
	static boolean [] check = new boolean[9];
	static ArrayList<Integer> list = new ArrayList<>();
	static int [] result = new int[9];
	static boolean flag = false;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		DFS(arr,0);
	}
	static void DFS(int [] arr,int sum) {
		if(sum>=100) {
			if(list.size()==7 && sum == 100) {
				Collections.sort(list);
				for(int i=0; i<7; i++) {
					result[i] = list.get(i);
					System.out.println(result[i]);
				}
				flag = true;
			}
			return;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(!check[i] && !flag) {
				check[i] = true;
				list.add(arr[i]);
				DFS(arr,sum+arr[i]);
				check[i] = false;
				if(flag) break;
				list.remove(list.indexOf(arr[i]));
			}
		}
	}
	
}




