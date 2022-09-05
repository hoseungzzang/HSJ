package inf.stackqueue;

public class ex04_8 {

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
	
	public String solution(int human, int horse) {
		String answer= "YES";
		int [] arr = {1,-1,5};
		int index =0;
		int min = Integer.MAX_VALUE;
		Queue<Integer> que = new LinkedList<Integer>();
		que.offer(human);
		int cnt=0;
		while(true) {
			int num = que.poll();
			for(int i=0; i<arr.length; i++) {
				int check = horse - (num + arr[i]);
				if(num + arr[i] == horse) {
					cnt++;
					return Integer.toString(cnt);
				}
				else{
					if(check<0) {
						check*=-1;
					}
					
					if(min>check) {
						min = check;
						index = i;
					}
				}
			
			}
				que.offer(num+arr[index]);
				cnt++;
			
		
		}
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		int human = Integer.parseInt(str.nextToken());
		int horse = Integer.parseInt(str.nextToken());

		
		System.out.println(T.solution(human, horse));
	}

}



*/