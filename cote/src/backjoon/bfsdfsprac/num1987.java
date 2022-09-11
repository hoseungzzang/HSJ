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

public class num1987 {
	
	static int count =0;
	static int R;
	static int C;
	static ArrayList<String> list;
	static ArrayList<String> check;
	static int max =Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		 R = Integer.parseInt(str.nextToken());
		 C = Integer.parseInt(str.nextToken());
		 String [][] line = new String  [R][C];

		
		for(int i=0; i<R; i++) {
			String [] arr = br.readLine().split("");
			for(int j=0;j<C; j++) {
				line[i][j]= arr[j];
			}
		}
		for(int i=0; i<2; i++) {
			list = new ArrayList<String>();
			check = new ArrayList<String>();
			DFS(0,0,line,i);
			max = Integer.max(max,count);
			count=0;
		}
			

			
		System.out.println(max);
		
	}
	public static void DFS(int j, int k , String [][] line , int flag) {
		if(j<0||j>R-1 || k<0 || k>C-1 ) {
			return;
		}
		if(list.indexOf(line[j][k])!=-1) {
			return;
		}
		list.add(line[j][k]);
		if(check.indexOf(line[j][k])==-1) {
			check.add(line[j][k]);
			count++;
		}
		
		if(j==0&&k==0&&flag==0) {
			DFS(j,k+1,line,flag);
			
		}else if(j==0&&k==0&&flag==1) {
			DFS(j+1,k,line,flag);
		}else {
			DFS(j-1,k,line,flag);
			DFS(j,k+1,line,flag);
			DFS(j+1,k,line,flag);
			DFS(j,k-1,line,flag);
		}
		list.remove(line[j][k]);
	}
}
