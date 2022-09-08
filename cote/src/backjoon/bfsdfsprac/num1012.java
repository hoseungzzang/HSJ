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

public class num1012 {
	
	static boolean [][] check;
	static int M;
	static int N;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = Integer.parseInt(br.readLine());
		for(int i=0; i<tc; i++) {
			StringTokenizer str  = new StringTokenizer(br.readLine());
			M = Integer.parseInt(str.nextToken());
			 N = Integer.parseInt(str.nextToken());
			int one = Integer.parseInt(str.nextToken());
			 int [][] line = new int  [M][N];
			check = new boolean[M][N];
			for(int j=0; j<one; j++) {
				str  = new StringTokenizer(br.readLine());
				int num1 = Integer.parseInt(str.nextToken());
				int num2 = Integer.parseInt(str.nextToken());
				line[num1][num2] = 1;
			}
			int cnt=0;
			for(int j=0;j<M;j++) {
				for(int k=0;k<N;k++) {
					if(line[j][k]==1 && !check[j][k]) {
						cnt++;
						DFS(j,k,line);
					}
					
				}
				
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
		
	}
	public static void DFS(int j, int k , int [][] line) {
		if(j<0||j>M-1 || k<0 || k>N-1 ) {
			return;
		}
		if(line[j][k] !=1 || check[j][k]) return;
		
		check[j][k] = true;
		DFS(j-1,k,line);
		DFS(j,k+1,line);
		DFS(j+1,k,line);
		DFS(j,k-1,line);
	}
}
