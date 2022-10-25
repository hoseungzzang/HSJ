package backjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num16234 {
	static int [] y = {-1,0,1,0};
	static int [] x = {0,1,0,-1};
	static int calc =1;
	static Queue<Point> remember  = new LinkedList<>();
	static ArrayList<Point> list;
	static int [][] check;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int l = Integer.parseInt(str.nextToken());
		int r = Integer.parseInt(str.nextToken());
		 int [][] arr = new int[n][n];
		 
		for (int i = 0; i < n; i++) {
			 str = new StringTokenizer(br.readLine());
			for(int j=0; j<n;j++) {
				arr[i][j] =  Integer.parseInt(str.nextToken());
			}
		}
		int sum = 0;
		while(calc!=0) {
			check = new int[n][n];
			list = new  ArrayList<Point>();
			calc=0;
			BFS(arr,l,r);
			if(!list.isEmpty())sum++;
		}
		System.out.println(sum);
		
	}
	
	public static void BFS(int [][] arr,int l, int r) {
		Queue<Point> que  = new LinkedList<>();
		que.offer(new Point(0,0));
		while(!que.isEmpty()) {
			boolean flag = false;
			Point num = que.poll();
			check[num.x][num.y]=1;
			for(int i=0; i<4; i++) {
				if(num.x+y[i]>=0 && num.x+y[i]<arr.length && num.y+x[i]>=0 && num.y+x[i]<arr.length ) {
					int sum = Math.abs(arr[num.x][num.y] - arr[num.x+y[i]][num.y+x[i]]);
					if(sum>=l && sum<=r) {
						if(!flag) {
							flag = true;
							list.add(new Point(num.x,num.y));
							calc += arr[num.x][num.y];
						}
					}
					if( check[num.x+y[i]][num.y+x[i]]!=1 ) {
						check[num.x+y[i]][num.y+x[i]]=1;
						que.offer(new Point(num.x+y[i],num.y+x[i]));
					}
				}
			}
		
		}
		if(list.size()!=0) {
			calc /=list.size();
			for(int i=0; i<list.size(); i++) {
				arr[list.get(i).x][list.get(i).y] = calc;
			}
			
		}
		
	}

}

//좌표 저장을 위한 클래스 선언
class Point{
	public int x,y;
	Point(int x, int y){
		this.x= x;
		this.y = y;
		
	}
}