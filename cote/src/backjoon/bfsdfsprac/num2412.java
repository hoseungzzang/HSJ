package backjoon.bfsdfsprac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num2412 {
	static int [][] line;
	static int roop;
	static int target;
	static int count =0;
	static boolean flag;
	static ArrayList<Integer> list2;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer str = new StringTokenizer(br.readLine());
			roop = Integer.parseInt(str.nextToken());
			target = Integer.parseInt(str.nextToken());
			line = new int[roop][2];
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=0; i<roop; i++) {
				str = new StringTokenizer(br.readLine());
				line[i][0] = Integer.parseInt(str.nextToken());
				line[i][1] =  Integer.parseInt(str.nextToken());
				list.add(i);
			}
			int min = Integer.MAX_VALUE;
			for(int i=0; i<roop;i++) {
				if(line[i][0]-0<3 &&line[i][1]-0<3) {
					int cnt = 1;
					flag = false;
					 list2 = new ArrayList<>(list);
					DFS(line[i][0],line[i][1],i,cnt);
					min = Integer.min(min, count);
				}
			}

		System.out.println(min);
	}
	public static void DFS(int x, int y,int index,int cnt) {
		if(y==target) {
			count = cnt;
			flag = true;
			return;
		}
		list2.remove(list2.indexOf(index));
		for(int i=0; i<roop; i++) {
			if(flag)break;
			if(list2.indexOf(i)!=-1&& (int)Math.abs(line[i][0]-x)<3 && (int)Math.abs(line[i][1]-y)<3) {
				DFS(line[i][0],line[i][1],i,cnt+1);
			}
		}
	}
}
