package inf.greedy;

public class ex09_1 {

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
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public int solution(int[] line,Map<Integer,Integer> map ) {

		int cnt=1;
		Arrays.sort(line);
		
		int max = map.get(line[line.length-1]);
		
		for(int i=line.length-1; i>=0; i--) {
			if(map.get(line[i])>max) {
				cnt++;
				max=map.get(line[i]);
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();

		int n = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int [] line = new int[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer	str =new StringTokenizer(br.readLine());
		
				int num1 = Integer.parseInt(str.nextToken());
				int num2 = Integer.parseInt(str.nextToken());
				map.put(num1,num2);
				line[i] = num1;
		}

		System.out.println(T.solution(line,map));
		
	}

}




*/