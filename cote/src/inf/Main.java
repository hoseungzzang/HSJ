package inf;

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
	static int total,roop,max=0;
	static int min = Integer.MAX_VALUE; 
	public void solution(int cnt , int start,int sum, int [] arr) {
		if(sum==0) {
			min= Integer.min(min, cnt);
			return;
		}

		if(start <0) {
			return;
		}
		cnt+=sum/arr[start];
		solution(cnt,start-1,  sum%arr[start],arr);
		cnt-=sum/arr[start];
		solution(cnt,start-1, sum,arr);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		

		int [][] arr = new int[9][9];
		Arrays.fill(arr,1);

		for(int i=1; i<=7; i++) {
				StringTokenizer str = new StringTokenizer(br.readLine());
			for(int j=1; j<7; j++) {
					arr[i][j] = Integer.parseInt(str.nextToken());
			}

		}
		total = Integer.parseInt(br.readLine());
		//T.solution(0,roop-1,total,arr);
		
		System.out.println(min);
	}

}
