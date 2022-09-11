package inf.sort;

public class ex06_1 {

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

	public void solution(int[] line,int index ,int n, int roop) {
		
	ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(index<roop) {
			
			if(list.size()!=n) {
				if(list.indexOf(line[index])==-1) {
					list.add(0,line[index]);
				}else {
					list.remove(list.indexOf(line[index]));
					list.add(0,line[index]);
				}
			}else {
				if(list.indexOf(line[index])==-1) {
					list.remove(list.get(n-1));
					list.add(0,line[index]);
				}else {
					list.remove(list.indexOf(line[index]));
					list.add(0,line[index]);
				}
			}
			index++;
		}
		if(list.size()!=n) {
			for(int i=0; i<n-list.size(); i++) {
				list.add(0);
			}
		}
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();

		StringTokenizer	str =new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int roop = Integer.parseInt(str.nextToken());
		
		int [] line = new int[roop];
		int index=0;
		str =new StringTokenizer(br.readLine());
		for(int i=0; i<roop; i++) {
			line[i] = Integer.parseInt(str.nextToken());
		}
		T.solution(line, index,n,roop);
		
		
		
	}

}



*/