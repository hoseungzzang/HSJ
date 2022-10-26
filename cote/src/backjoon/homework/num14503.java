package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num14503 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] xPosition = {0,1,0,-1};
		int [] yPosition = {-1,0,1,0};
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0,3);
		map.put(1,0);
		map.put(2,1);
		map.put(3,2);
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		 int [][] arr = new int[n][m];
		 str = new StringTokenizer(br.readLine());
		 int h = Integer.parseInt(str.nextToken());
		 int y = Integer.parseInt(str.nextToken());
		 int p = Integer.parseInt(str.nextToken());
		 int cnt =1;
		 for(int i=0; i<n;i++) {
			 str = new StringTokenizer(br.readLine());
			 for(int j=0; j<m; j++) {
				 arr[i][j] = Integer.parseInt(str.nextToken());
			 }
		 }
		 int flag = 0;
		arr[h][y] = 2;
		while(true) {
			if(flag == 4) {
				if(arr[h-yPosition[p]][y-xPosition[p]]==1) {
					break;
				}else {
					h-=yPosition[p];
					y-=xPosition[p];
					flag =0;
				}
			}else {
				int go = map.get(p);
				if(arr[h+yPosition[go]][y+xPosition[go]]==0) {
					h+=yPosition[go];
					y+=xPosition[go];
					arr[h][y] = 2;
					cnt++;
					flag = 0;
				}else {
					flag++;
				}
				p = go;
			}
			
		}
		System.out.println(cnt);
	}
}
