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

public class num15650 {
	
	static boolean [] check;
	static int count =0;
	static int roop ;
	static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Integer> rem = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(str.nextToken());
		int pri = Integer.parseInt(str.nextToken());
		 int [] line = new int  [pri+1];

		check = new boolean[num+1];

	
			DFS(1,0,pri,line,num);

	
		bw.flush();
		
	}
	public static void DFS(int j, int cnt,int pri , int [] line,int num) {
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
