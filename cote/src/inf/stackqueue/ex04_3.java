package inf.stackqueue;

public class ex04_3 {

}

/*

import java.io.BufferedReader;
import java.util.HashMap;import java.util.Map;import java.util.Map.Entry;
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
	
	public String solution(int roop, int [][] arr, int turn, int [] turnArr) {
		String answer = "";
		int cnt = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<turnArr.length; i++) {
			
			for(int j=0;j <roop; j++) {
				if(arr[j][turnArr[i]-1] !=0) {
					if(stack.isEmpty()) {
						stack.push(arr[j][turnArr[i]-1]);
						arr[j][turnArr[i]-1]=0;
						break;
					}else {
						if(	stack.peek() ==arr[j][turnArr[i]-1]) {
							arr[j][turnArr[i]-1]=0;
							cnt+=2;
							stack.pop();
						}else {
							
							stack.push(arr[j][turnArr[i]-1]);
							arr[j][turnArr[i]-1]=0;
						}
						break;
					}
				}
			}

		}
	
		

		return Integer.toString(cnt);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int roop = Integer.parseInt(br.readLine());
		int [][] arr= new int[roop][roop];
		StringTokenizer st ;
		for(int i=0; i<roop; i++) {
			 st = new StringTokenizer(br.readLine());
			for(int j=0; j<roop; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int turn = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int [] turnArr = new int[turn];
		for(int i=0; i<turn; i++) {
			turnArr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(T.solution(roop, arr, turn, turnArr));
	}

}



*/