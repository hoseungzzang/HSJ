package inf.sort;

public class ex06_4 {

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

	public String solution(int[] line ,int match) {
		String answer="";
		int st = line.length/2;
		int end = line.length/2;
		Arrays.sort(line);
		while(st>=0 ||end<line.length) {
			if(st>=0) {
				if(line[st] == match) {
					answer+=(st+1);
					break;
				}
			}
			
			if(end<line.length) {
				if(line[end] == match) {
					answer+=(end+1);
					break;
				}
			}
			st--;
			end++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();

		StringTokenizer	str =new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int match = Integer.parseInt(str.nextToken());
		
		int [] line = new int[n];
		str =new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			line[i] = Integer.parseInt(str.nextToken());
		}
		System.out.println(T.solution(line,match)); 
		
		
		
	}

}





*/