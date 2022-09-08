package inf.bfsdfs;

public class ex05_5 {

}

/*

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
	static boolean [][] check;
	public void solution(int start, int end, int [][] arr) {
		if(arr[start][end]==1 || check[start][end]==true) {
			return;
		}
		if(start==7 && end==7) {
			answer++;
			return;
		}
		check[start][end] = true;
		solution(start-1,end,arr);
		solution(start,end+1,arr);
		solution(start+1,end,arr);
		solution(start,end-1,arr);
		check[start][end] = false;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int [][] arr = new int[9][9];
		check = new boolean[9][9];
		for(int i=0; i<9; i++) {
			if(i==0 || i==8) {
				for(int j=0; j<9; j++) {
						arr[i][j] = 1;
				}
			}
			else {
				StringTokenizer str = new StringTokenizer(br.readLine());
				for(int j=0; j<9; j++) {
					if(j==0 || j==8) {
						arr[i][j] = 1; 
					}
					else {
						int num = Integer.parseInt(str.nextToken()) ;
						if(num==1) {
							arr[i][j] = 1;
						}
					}
					
				}
			}
			
		}
		
		T.solution(1,1,arr);
		System.out.println(answer);
		
	}

}




*/