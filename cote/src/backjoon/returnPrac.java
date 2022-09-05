package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class returnPrac {
	static int [][] line;
	static boolean [] check;
	static int N;
	static int cnt;
    // DFS 메소드
	public static void BFS(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(start);
		check[start] = true;
	
		while(!que.isEmpty()) {
			int num = que.poll();
			for(int i=1; i<line[num].length; i++) {
				if(line[num][i]==1 && !check[i]) {
					check[i] = true;
					que.offer(i);
				
			}
		}
		
		
	}
    
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer str  = new StringTokenizer(br.readLine());
		N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		int start=0;
		line = new int  [N+1][N+1];
		check = new boolean[N+1];
		for(int i=0; i<M; i++) {
			
			str  = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(str.nextToken());
			int num2 = Integer.parseInt(str.nextToken());
			line[num1][num2] = 1;
			line[num2][num1] = 1;
			if(i==0) {
				start = num1;
			}
		}
		cnt=1;
		BFS(start);
	}
}