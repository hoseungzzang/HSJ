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

public class num1707 {
	
	static boolean []check;
	static String answer;
	static int [][] line;
	static int v;
	static int e;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int roop = Integer.parseInt(br.readLine());
		for(int i=0; i<roop;i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			v= Integer.parseInt(str.nextToken());
			e= Integer.parseInt(str.nextToken());
			check = new boolean[v];
			line = new int[v][v];
			 
			 for(int j=0;j<e; j++) {
				 str = new StringTokenizer(br.readLine());
				 int num1 = Integer.parseInt(str.nextToken())-1;
				 int num2 = Integer.parseInt(str.nextToken())-1;
				 line[num1][num2] = 1;
				 line[num2][num1] =1;
			 }
				DFS(0);
		}
		


	


	
		bw.flush();
		
	}
	public static void DFS(int start) {
		if(cnt==pri) {

			for(int i=0; i<list.size(); i++) {
				System.out.print(list.get(i)+" ");
			}
			System.out.println();
			return;
		}
	
		for(int i=1; i<=num; i++) {
				if(!check[i]) {
					check[i] = true;
					list.add(i);
					DFS(i,cnt+1,pri,line,num);
					check[i]=false;
					list.remove(list.get(list.indexOf(i)));
				}
		}
		
	}
}
