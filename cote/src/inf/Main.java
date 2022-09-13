package inf;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;import java.util.Map.Entry;
import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

class Point{
	public int x,y;
	Point(int x, int y){
		this.x= x;
		this.y = y;
		
	}
}

public class Main {
	static boolean [][] check;
	static int count =0;
	static int roop ;
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};
	static int [][] line,dis;
	public void solution(int x,int y) {

		
		Queue<Point> que = new LinkedList<Point>();
		que.offer(new Point(x,y));
		line[x][y]=1;
		while(!que.isEmpty()) {
			if(dis[7][7]!=0) break;
			Point tmp = que.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=1 && nx<8 && ny>=1 && ny<8 && line[nx][ny]==0 ) {
					line[nx][ny]=1;
					que.offer(new Point(nx,ny));
					dis[nx][ny] =dis[tmp.x][tmp.y] +1;
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
	 line = new int[8][8];
	 dis = new int[8][8];
		check = new boolean[8][8];

		for(int i=1; i<=7; i++) {
			StringTokenizer	str =new StringTokenizer(br.readLine());
			for(int j=1; j<=7; j++) {
				line[i][j] = Integer.parseInt(str.nextToken());
			}
		}
		T.solution(1,1);
		if(dis[7][7]==0) {
			System.out.println(-1);
		}else {
			System.out.println(dis[7][7]); 
		}
	}

}
