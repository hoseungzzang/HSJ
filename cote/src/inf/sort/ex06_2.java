package inf.sort;

public class ex06_2 {

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

	public String solution(int[] line ,int n) {
	String answer = "U";
	ArrayList<Integer> list = new ArrayList<Integer>();
	for(int i=0; i<n;i++) {
		if(list.indexOf(line[i])!=-1) {
			answer="D";
			break;
		}
		list.add(line[i]);
	}
	return answer;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();


		int n = Integer.parseInt(br.readLine());
		
		int [] line = new int[n];
		StringTokenizer	str =new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			line[i] = Integer.parseInt(str.nextToken());
		}
		System.out.println(T.solution(line,n)); 
		
		
		
	}

}




*/