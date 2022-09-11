package inf.bfsdfs;

public class ex05_7 {

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
	static int roop;
	static boolean [][] check;
	public void solution(int N, int M, int[][] arr) {
	
		if(N<0||N>roop-1 || M<0 || M>roop-1) {
			return; 
		}

			if(check[N][M] || arr[N][M]!=1){
	            return;
	       }
			check[N][M]= true;
			solution(N-1,M,arr);
			solution(N,M+1,arr);
			solution(N+1,M,arr);
			solution(N,M-1,arr);
			solution(N-1,M+1,arr);
			solution(N-1,M-1,arr);
			solution(N+1,M+1,arr);
			solution(N+1,M-1,arr);
		
	
	
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		 roop = Integer.parseInt(br.readLine());
		int [][] line = new int[roop][roop];
		check = new boolean[roop][roop];
		
		for(int i=0; i<roop; i++) {
			StringTokenizer str =new StringTokenizer(br.readLine());
			for(int j=0; j<roop; j++) {
				line[i][j] = Integer.parseInt(str.nextToken());
			}
		}
		
		for(int i=0; i<roop; i++) {
			for(int j=0;j<roop;j++) {
				if(!check[i][j] && line[i][j]==1) {
					answer++;
					T.solution(i,j,line);
				}
			}
			
		
		}
		
		System.out.println(answer);
		
	}

}





*/