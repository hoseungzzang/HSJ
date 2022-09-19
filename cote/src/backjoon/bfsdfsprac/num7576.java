package backjoon.bfsdfsprac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num7576 {
	
	//상하좌우탐색을 위한 집합
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};
	//토마토의 상태(line) 와 일자별 익은 토마토를 카운트 하기위한(dis) 2차원 배열 선언 
	static int [][] line, dis;
	//탐색 종료 시 익지못한 토마토가 있는지 체크하기 위한 변수
	static int zeroCount =0;
	//일자 카운트를 위한 변수
	static int cnt=0;
	//탐색좌표를 저장하는 큐 선언
	static Queue<Point> que = new LinkedList<Point>(); 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		 line = new int  [m][n];
		 dis = new int [m][n];
		 //토마토의 상태 저장하는 2중for문
		for(int i=0; i<m; i++) {
			str = new StringTokenizer(br.readLine());
			for(int j=0;j<n; j++) {
				int num = Integer.parseInt(str.nextToken());
				//1이면 익은 토마토의 좌표 저장, 0이면 익지않은 토마토 수 카운트
				if(num==1) {
					que.offer(new Point(i,j));
				}else if(num==0) zeroCount++;
				line[i][j]= num;
			}
		}
		
		BFS(n,m);
		
		//탐색 종료 시 익지않은 토마토가 있으면 -1 출력, 없으면 모두 익은 날짜 출력
		if(zeroCount!=0) {
			System.out.println(-1);
		}else {
			System.out.println(cnt);
		}
	
	}
	
	public static void BFS(int n, int m) {
		
		while(!que.isEmpty()) {
			//좌표 클래스에 좌표 저장
			Point tmp = que.poll();
			//해당 좌표의 날짜 저장
			cnt = dis[tmp.x][tmp.y];
			//상,하,좌,우 탐색
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				//해당 좌표가 범위를 넘지 않고, 안익은 토마토일때 진입
				if(nx>=0&& nx<m&& ny>=0 && ny<n && line[nx][ny]==0) {
					//다시 탐색할 수 없게 해당 좌표 익은상태로 저장
					line[nx][ny] = 1;
					//해당 좌표부터 탐색하기 위해 큐에 저장
					que.offer(new Point(nx,ny));
					//안익은 토마토가 하나 익었기 때문에 안익은토마토 --
					zeroCount--;
					//해당토마토가 몇일차에 익었는지 dis 배열에 표시
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}
	}
	
}
/*
//que에 좌표 자체를 저장하기 위한 클래스 선언
class Point{
	public int x,y;
	Point(int x, int y){
		this.x= x;
		this.y = y;
		
	}
}
*/


