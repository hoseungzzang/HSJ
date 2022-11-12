package backjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
public class num1966 {
	
static class point{
		int num;
		int index;
		point(int num, int index){
			this.num = num;
			this.index = index;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력 값 저장
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			int cnt = 0;
			StringTokenizer str = new StringTokenizer(br.readLine());
			Queue<point> que = new LinkedList<>();
			PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
			int num = Integer.parseInt(str.nextToken());
			int index = Integer.parseInt(str.nextToken());
			str = new StringTokenizer(br.readLine());
			for(int j=0;j<num; j++ ) {
				int su = Integer.parseInt(str.nextToken());
				que.offer(new point(su,j));
				max.offer(su);
	
			}
			while(!que.isEmpty()) {
				point p = que.peek();
				if(p.num==max.peek()) {
					if(p.index==index) {
						cnt++;
						break;
					}
					cnt++;
					que.poll();
					max.poll();
				}else {
					que.offer(que.poll());
				}
			}
			bw.write(cnt+"\n");
		}
		bw.flush();
	}

}
