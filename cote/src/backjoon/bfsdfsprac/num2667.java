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

public class num2667 {
	
	static boolean [][] check;
	static int count =0;
	static int roop ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 roop = Integer.parseInt(br.readLine());
		 int [][] line = new int  [roop][roop];
		for(int i=0; i<roop; i++) {
			String [] arr = br.readLine().split("");
			for(int j=0;j<roop; j++) {
				line[i][j]= Integer.parseInt(arr[j]);
			}
		}
			ArrayList<Integer> list = new ArrayList<Integer>();
			check = new boolean[roop][roop];

			int cnt=0;
			for(int j=0;j<roop;j++) {
				for(int k=0;k<roop;k++) {
					if(line[j][k]==1 && !check[j][k]) {
						cnt++;
						DFS(j,k,line);
						list.add(count);
						count=0;
					}
				}
				
			}
			bw.write(cnt+"\n");
			Collections.sort(list);
			for(int i=0; i<list.size(); i++) {
				bw.write(list.get(i) +"\n");
			}
		bw.flush();
		
	}
	public static void DFS(int j, int k , int [][] line) {
		if(j<0||j>roop-1 || k<0 || k>roop-1 ) {
			return;
		}
		if(line[j][k] !=1 || check[j][k]) return;
		
		count++;
		check[j][k] = true;
		DFS(j-1,k,line);
		DFS(j,k+1,line);
		DFS(j+1,k,line);
		DFS(j,k-1,line);
	}
}
