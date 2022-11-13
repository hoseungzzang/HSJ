package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class num1303 {
	static boolean [][] check;
	static int [] px = {-1,0,1,0};
	static int [] py = {0,1,0,-1};
	static String [][] map;
	static int count =0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(str.nextToken());
		int n=  Integer.parseInt(str.nextToken());
		map = new String[n][m];
		check = new boolean[n][m];
		HashMap<String,Integer> calc = new HashMap<>();
		calc.put("B", 0);
		calc.put("W", 0);
		for(int i=0; i<n; i++) {
			String [] arr = br.readLine().split("");
			for(int j=0;j<m;j++) {
				map[i][j] = arr[j];
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!check[i][j]) {
					count =1;
					BFS(map[i][j], new point(i,j),n,m);
					calc.put(map[i][j], calc.get(map[i][j])+(count*count));
				}
			}
		}
		System.out.println(calc.get("W") + " " + calc.get("B") );
	}
	static void BFS(String color, point p,int n, int m) {
		Queue<point> que = new LinkedList<point>();
		check[p.x][p.y] = true;
		que.offer(p);
		while(!que.isEmpty()) {
			point obj = que.poll();
			for(int i=0; i<4; i++) {
				if(obj.x+px[i]>=0 && obj.x+px[i]<n && obj.y+py[i]>=0 && obj.y+py[i] <m && !check[obj.x+px[i]][obj.y+py[i]]) {
					if(map[obj.x+px[i]][obj.y+py[i]].equals(color)) {
						que.offer(new point(obj.x+px[i],obj.y+py[i]));
						check[obj.x+px[i]][obj.y+py[i]] = true;
						count++;
					}
				}
			}
		}
	}
}
class point{
	int x;
	int y;
	point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
}




