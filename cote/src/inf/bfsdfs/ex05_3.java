package inf.bfsdfs;

public class ex05_3 {

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
	static int total,roop,max=0;
	public void solution(int start,int timeSum,int score, int [][] arr) {
		if(total<timeSum) {
			return;
		}
		if(start == roop) {
			max = Integer.max(max, score);
			return;
		}
	
		solution(start+1, timeSum+arr[start][1],score+arr[start][0],arr);
		solution(start+1, timeSum,score,arr);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		roop = Integer.parseInt(str.nextToken());
		total = Integer.parseInt(str.nextToken());
		int [][] arr = new int[roop][roop];
		
		for(int i=0; i<roop; i++) {
			str = new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				arr[i][j] = Integer.parseInt(str.nextToken());
			}
		}

		T.solution(0,0,0,arr);
		
		System.out.println(max);
	}

}



*/