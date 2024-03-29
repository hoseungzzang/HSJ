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

public class dfsbfs {
	
	static int [][] line;
	static boolean [] check;
	static int N;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer str  = new StringTokenizer(br.readLine());
		N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		int start = Integer.parseInt(str.nextToken());
		line = new int  [N+1][N+1];
		check = new boolean[N+1];
		//4 5 1 
		//정점이 양방향이라서 1 2
		for(int i=0; i<M; i++) {
			str  = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(str.nextToken());
			int num2 = Integer.parseInt(str.nextToken());
			line[num1][num2] = 1;
			line[num2][num1] = 1;
		}
		DFS(start);
		System.out.println();
		check = new boolean[N+1];
		BFS(start);
	}

	public static void DFS(int start) {
		//1
		if(check[start]) {
			return ;
		}
		System.out.print(start+" ");
		
		check[start] = true;
		// i == 2 56줄에서 멈추는
		for(int i=1; i<line[start].length; i++) {
			if(line[start][i]==1 && !check[i]) {
				DFS(i);
			}
		}
		
	}
	public static void BFS(int start) {
		//BFS를 사용하기 위한 큐 선언
		Queue<Integer> que = new LinkedList<Integer>();
		//스타트지점 큐에 넣고 치크
		que.offer(start);
		check[start] = true;
	
		while(!que.isEmpty()) {
			int num = que.poll();
			System.out.print(num+" ");
			for(int i=1; i<line[num].length; i++) {
				if(line[num][i]==1 && !check[i]) {
					check[i] = true;
					que.offer(i);
				}
			}
		}
		
		
	}
}
