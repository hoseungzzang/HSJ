package inf;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	
	static int [] dy ;
	public int solution(int n , int [] arr) {
		dy[0] = 1;
		int answer =0;
		for(int i = 1; i<n; i++) {
			int max = Integer.MIN_VALUE;
			for(int j = i-1; j>=0; j--) {
				if(arr[j]<arr[i]&& dy[j]>max) {
					dy[i] = dy[j]+1;
					max = dy[j];
				}
			}
			if(max == Integer.MIN_VALUE) dy[i] = 1;
			answer = Math.max(answer, dy[i]);
		}

		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		int roop = Integer.parseInt(br.readLine());
		dy = new int[roop];
		int [] arr = new int [roop];
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<roop; i++) {
			arr[i] =  Integer.parseInt(str.nextToken());
		}
		System.out.println(T.solution(roop,arr)); 
	}
}
