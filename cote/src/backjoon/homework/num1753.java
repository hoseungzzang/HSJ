package backjoon.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class num1753 {

	static ArrayList<calc>[] list; 
	static int [] distance;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(str.nextToken());
		int E = Integer.parseInt(str.nextToken());
		int K = Integer.parseInt(br.readLine())-1;
		list = new ArrayList [V];
		distance = new int[V];
		for(int i=0; i<V; i++) {
			list[i] = new ArrayList<>();
		}
		Arrays.fill(distance,Integer.MAX_VALUE);
		for(int i=0; i<E; i++) {
			str = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(str.nextToken()); //5
			int v = Integer.parseInt(str.nextToken());//1
			int w = Integer.parseInt(str.nextToken());//1
			list[u-1].add(new calc(v-1,w));
			/*

			 */
		}
		BFS(K);
		for(int i=0; i<distance.length; i++) {
			if(distance[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			}else {
				System.out.println(distance[i]);
			}
		}
	}
	
	public static void BFS(int K) {
		//우선순위  큐를 오름차순
		PriorityQueue<calc> que = new PriorityQueue<>(); 
		//큐에 시작값, 비용
		que.add(new calc(K,0));
		//시작값이기떄문에 0 
		distance[K] = 0;
		
		while(!que.isEmpty()) {
			//노드, 비용 내가 있는곳 1,0
			calc c = que.poll();
			//list[c.node].size   list[1],size 1번노드가 보고있는 다른 노드들의 집ㅈ합
			//2차원배열 체크 
			//1 2 2
			//1 3 3
			for(int i=0; i<list[c.node].size(); i++) {
				calc obj = list[c.node].get(i);
				//1 2 2 
				//노드 3
				int node = obj.node;
				//비용 3 + 0 3번노드의 비용 
				int dis = obj.dis + c.dis;
				//2121313 > dis  distance [0] = 0 , 1 = 2 , 2= 3
				if(distance[node] > dis) {
					distance[node] =dis;
					//que 
					que.offer(new calc(node,dis));
				}
			}
		}

	}
}

//que에 좌표 자체를 저장하기 위한 클래스 선언
class calc implements Comparable<calc>{
	public int node,dis;
	calc(int node, int dis){
		this.node= node;
		this.dis = dis;
		
	}
	@Override
    public int compareTo(calc o) {
        return dis - o.dis;
    }
}



