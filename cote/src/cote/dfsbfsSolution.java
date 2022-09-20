package cote;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import inf.Main;

public class dfsbfsSolution {
	
	static boolean [] check;
	static int [] answer;
	static int count=0;
	public static void DFS(int start, int cnt, int n, int k) {
			if(count==k|| cnt==n) return;
			if(cnt==n-1) {
				count++;
			}
			
			for(int i=0; i<n; i++) {
				if(!check[i]) {
					answer[cnt] = i+1;
					check[i]= true;
					DFS(i,cnt+1,n,k);
					check[i] = false;
					if(count==k) break;
				
				}
				
				
			}
		
	}
	
	public static void main(String[] args) {
		
		int n=3;
		int k = 5;
		
		

			check = new boolean[n];
			answer = new int [n];
			DFS(0,0,n,k);

	

		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}

}
