package inf.greedy;

public class ex09_3 {

}

/*

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	public int solution(int [][] arr) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<arr.length; i++) {
			String s =Integer.toString(arr[i][0])+"s" ;
			String e =Integer.toString(arr[i][1])+"e" ;
			list.add(s);
			list.add(e);
		}
		int max = Integer.MIN_VALUE;
		int cnt=0;
		for(int i=0; i<=72; i++) {
			cnt -= Collections.frequency(list, Integer.toString(i)+"e");
			cnt += Collections.frequency(list, Integer.toString(i)+"s");
			max = Integer.max(max, cnt);
		}
		
		
		
		return max;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		int roop = Integer.parseInt(br.readLine());
		int [][] arr = new int[roop][2];
		for(int i=0; i<roop; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(str.nextToken()) ;
			arr[i][1] = Integer.parseInt(str.nextToken()) ;
		}
		Arrays.sort(arr, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		    	if(o1[0] == o2[0]){
		        	return Integer.compare(o1[1],o2[1]);
		    	}
		        else{
		        	return Integer.compare(o1[0],o2[0]);
		        }
		    }
		});
		System.out.println(T.solution(arr)); 
	}
}




*/