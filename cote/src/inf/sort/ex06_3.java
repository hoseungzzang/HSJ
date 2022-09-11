package inf.sort;

public class ex06_3 {

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
	String answer = "";
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=0; i<line.length; i++) {
		list.add(line[i]);
	}
	Collections.sort(list);
	int flag=0;
	for(int i=0; i<line.length-1; i++) {
		if(line[i] != list.get(i)) {
			int num = list.get(i);
			answer+= (i+1) +" ";
			for(int j=i+1;j<line.length;j++) {
				if(line[j]<line[j-1]&&line[j] ==num) {
					flag=j;
				}
			}
			answer+= flag+1;
			break;
		}
		
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