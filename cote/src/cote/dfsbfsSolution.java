package cote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import inf.Main;

public class dfsbfsSolution {
	
	static int answer =0;
	static boolean [] check;
	
	public static void DFS(int start, int[][] arr,int n) {

			if(check[start]) return;
			
			check[start]= true;
			for(int i=start+1; i<arr[start].length; i++) {
				int num = arr[start][i];
				if( num==1) {
					DFS(i,arr,n);
				}
				
			}
			
			
	
		
	}
	

	public static void main(String[] args) {
		
		int n=3;
		int[][] computers= {{1,0,0},{0,1,0},{0,0,1}};
		check = new boolean[n];
		for(int i=0; i<n; i++) {
			if(!check[i]) {
				answer++;
				DFS(i,computers,n);
			}
		
		}
		
		System.out.println(answer);
		
	}

}
