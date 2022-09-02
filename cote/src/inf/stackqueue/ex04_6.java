package inf.stackqueue;

public class ex04_6 {

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
	
	public String solution(int human, int call, int[] arr) {
		String answer= "YES";
		int cnt = 0;
		int index = arr.length-1;
		Queue<Integer> que =  new LinkedList<>();
		Queue<Integer> indexQue =  new LinkedList<>();
		for(int i=0; i<human; i++) {
			que.add(arr[i]);
			indexQue.add(i);
			}
		Arrays.sort(arr);
		while(true) {
			if(arr[index] == que.peek()) {
				if(indexQue.peek()==call) {
					cnt++;
					break;
				}
				que.remove();
				indexQue.remove();
				cnt++;
				index--;
			}else {
				que.offer(que.poll());
				indexQue.offer(indexQue.poll());
			}
		}
		return Integer.toString(cnt);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		int human = Integer.parseInt(str.nextToken());
		int call = Integer.parseInt(str.nextToken());
		int [] arr = new int[human];
		str = new StringTokenizer(br.readLine());
		for(int i=0; i<human; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		
		System.out.println(T.solution(human, call, arr));
	}

}



*/