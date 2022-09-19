package backjoon.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class num1715 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//카드 숫자 입력
		int num = Integer.parseInt(br.readLine());
		//우선순위 큐 선언(별도로 정렬의 방식을 선언하지 않았으므로 오름차순 정렬 됨)
		PriorityQueue<Long> low = new PriorityQueue<>();
		//큐에 삽입
		for (int j = 0; j < num; j++) {
			low.offer(Long.parseLong(br.readLine()));
		}
		//N이 한개일 경우에는 비교를 안하므로 0부터 시작
		long answer = 0;
		
		//N이 한개일 경우, 두개일 경우 모두 큐의 사이즈가 1이 아닐때 정상적인 답을 구할 수 있다.
		//무조건 큐에 한개가 남은 상태로 종료되기 때문에 que.isEmpty()을 종료조건으로 사용할 수 없다.
		while (low.size() != 1) {
			//최소의 수 두개 합친 값을 정답에 합쳐주고 최소의 합을 큐에 삽입
			long su = low.poll() + low.poll();
			answer += su;
			low.offer(su);
		}
		//정답 출력
		System.out.println(answer);

	}

}
