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
	
	public String solution(int roop, int [] arr) {
		String answer= "NO";
	
		
		return answer;
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int roop = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int [] arr = new int[roop];
		for(int i=0; i<roop; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}

		
		System.out.println(T.solution(roop,arr));
	}

}
