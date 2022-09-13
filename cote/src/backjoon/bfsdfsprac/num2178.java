package backjoon.bfsdfsprac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class num2178 {
	
	static boolean [][] check;
	static int count =0;
	static int roop ;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		 int [][] line = new int  [n][m];
		for(int i=0; i<n; i++) {
			String [] arr = br.readLine().split("");
			for(int j=0;j<m; j++) {
				line[i][j]= Integer.parseInt(arr[j]);
			}
		}
			check = new boolean[n][m];

			BFS(0,0,line);
				


	}
	public static void BFS(int n,int m, int [][] line) {
		
		Queue<Point> que = new LinkedList<Point>();
		que.offer(new Point(n,m));
		check[n][m]=true;
		while(!que.isEmpty()) {
			Point tmp = que.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
		
			}
			
		}
	
	}
	
}


