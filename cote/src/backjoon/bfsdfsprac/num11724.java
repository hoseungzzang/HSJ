package backjoon.bfsdfsprac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class num11724 {
	
	static int [][] line;
	static boolean [] check;
	static int N;
	static int cnt=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		StringTokenizer str  = new StringTokenizer(br.readLine());
		N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		line = new int  [N+1][N+1];
		check = new boolean[N+1];
		for(int i=0; i<M; i++) {
			str  = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(str.nextToken());
			int num2 = Integer.parseInt(str.nextToken());
			line[num1][num2] = 1;
			line[num2][num1] = 1;
		}
		check = new boolean[N+1];
		for(int i=1; i<=N; i++) {
			if(!check[i]) {
				cnt++;
			}
			DFS(i);
		}
		System.out.println(cnt);
	}
	public static void DFS(int start) {
		if(check[start]) {
			return;
		}
		check[start] = true;
		for(int i=1; i<=N; i++) {
			if(line[start][i]!=0) {
				DFS(i);
			}
		}

	}
}
