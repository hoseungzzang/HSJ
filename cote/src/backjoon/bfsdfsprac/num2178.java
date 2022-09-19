package backjoon.bfsdfsprac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//좌표 저장을 위한 클래스 선언
class Point{
	public int x,y;
	Point(int x, int y){
		this.x= x;
		this.y = y;
		
	}
}
public class num2178 {

	//상 하 좌 우로 이동하기 위한 좌표 배열
	static int[] dx= {-1,0,1,0};
	static int[] dy= {0,1,0,-1};
	
	//칸 수를 카운팅 하기 위한 2차원 배열 선언
	static int [][] dis;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		 int [][] line = new int  [n][m];
		 dis = new int[n][m];
		 
		for(int i=0; i<n; i++) {
			String [] arr = br.readLine().split("");
			for(int j=0;j<m; j++) {
				line[i][j]= Integer.parseInt(arr[j]);
			}
		}
			//시작지점, 입력받은 값 넣어줌
			BFS(0,0,n,m,line);
			//0부터 시작하기에 +1 해주는 모오습
			System.out.println(dis[n-1][m-1]+1);	


	}
	public static void BFS(int x, int y , int n,int m, int [][] line) {
		//시작지점 큐에 삽입
		Queue<Point> que = new LinkedList<Point>();
		que.offer(new Point(x,y));
		//시작지점 재방문 불가능하게 0으로 변경
		line[x][y]=0;
		//큐가 비는 시점이 종료지점에 도달했다는 의미
		while(!que.isEmpty()) {
			//현 좌표 큐에서 제거한 후 tmp에 반환
			Point tmp = que.poll();
			//상하좌우 체크
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if( nx>=0 && nx<n && ny>=0 && ny<m) {
					//조건에 부합한 좌표라면..
					if(line[nx][ny]!=0) {
						//큐에 삽입, 이동할 좌표에 현재좌표의 값 +1 만큼 카운팅
						que.offer(new Point(nx,ny));
						dis[nx][ny] = dis[tmp.x][tmp.y] +1;
						//이동할 좌표 재방문 불가능하게 0으로 변경
						line[nx][ny] = 0;
					}
				}
			}
			
		}
	
	}
	
}


