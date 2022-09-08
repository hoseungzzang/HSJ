package inf;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;import java.util.Map.Entry;
import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int answer =0;
	static int cnt=0;
	static int target;
	static boolean [] check;
	public void solution(int start, int[][] arr) {
		if(check[start]){
            return;
       }
		check[start]= true;
		for(int i=0; i<arr[start].length; i++) {
			int num = arr[start][i];
			if(!check[i] && num==1) {
				solution(start+1,arr);
			}
			
		}
	
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int n=3;
		int[][] computers= {{1,1,0},{1,1,0},{0,0,1}};
		check = new boolean[n];
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				answer++;
				T.solution(i,computers);
			}
		
		}
		
		System.out.println(answer);
		
	}

}
