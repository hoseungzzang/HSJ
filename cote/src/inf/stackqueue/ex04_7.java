package inf.stackqueue;

public class ex04_7 {

}

/*


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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public String solution(int human, int call) {
		String answer= "YES";
		int cnt = 1;

		Queue<Integer> que =  new LinkedList<>();
		for(int i=1; i<=human; i++) {
			que.add(i);
			}
		
		while(que.size()!=1) {
			
			
		
			if(cnt==call) {
				que.remove();
				cnt=1;
				continue;
			}
			else {
				que.add(que.poll());
			}
			cnt++;
	
		}
	

		return Integer.toString(que.peek());
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		int human = Integer.parseInt(str.nextToken());
		int call = Integer.parseInt(str.nextToken());

		
		System.out.println(T.solution(human, call));
	}

}



*/