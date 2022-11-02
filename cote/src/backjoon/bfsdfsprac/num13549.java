package backjoon.bfsdfsprac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num13549 {

	static Queue<time> que = new LinkedList<time>();
	static int min = Integer.MAX_VALUE;
	static boolean [] check = new boolean[100001];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());

		if (n >= m) {
			min = n - m;
		} else {
			BFS(n, m);
			if(min == Integer.MAX_VALUE) {
				System.out.println(0);
			}else {
				System.out.println(min);
			}
		}
		
	}

	public static void BFS(int n, int m) {
		que.offer(new time(n, 0));
		while (!que.isEmpty()) {
			//5 , 0
			time num = que.poll();
			if (num.point == m) {
				min = Math.min(min,num.sec);
			}
			
			if(num.point *2<=100000) {
				if(!check[num.point*2]) {
					check[num.point*2] = true;
					que.offer(new time(num.point *2 , num.sec));
				}
			}
			if(num.point-1>=0) {
				if(!check[num.point-1]) {
					check[num.point-1] = true;
					que.offer(new time(num.point -1 , num.sec+1));
				}
			}
			if(num.point +1<=100000) {
				if(!check[num.point+1]) {
					check[num.point+1] = true;
					que.offer(new time(num.point +1 , num.sec+1));
				}
			}
			
		}
	}

}

class time {
	//현재위치
	int point;
	//현재위치에 왔을때의 시간
	int sec;

	time(int point, int sec) {
		this.point = point;
		this.sec = sec;
	}
}
/*
 * //que에 좌표 자체를 저장하기 위한 클래스 선언 class Point{ public int x,y; Point(int x, int
 * y){ this.x= x; this.y = y;
 * 
 * } }
 */



