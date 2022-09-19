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
	static boolean flag = false;
	public static void DFS(int start, int cnt, int n, int k) {
			if(flag) return;
			if(check[start]) return;
			if(cnt==n-1) {
				count++;
			}
			
			answer[cnt] = start+1;
			check[start]= true;
			if(count==k) flag=true;
		
			for(int i=0; i<n; i++) {
				if(!check[i] && count!=k) {
					DFS(i,cnt+1,n,k);
					check[i] = false;
				}
				
				
			}
			
			
	
		
	}
	

	public static void main(String[] args) {
		
		int n=3;
		int k = 5;
		
		
		for(int i=0; i<n; i++) {
			check = new boolean[n];
			answer = new int [n];
			DFS(i,0,n,k);
			if(count==k) break;
		}
	

		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		
	}

}
