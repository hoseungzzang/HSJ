package inf.greedy;

public class ex09_2 {

}

/*

import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main {
	public int solution(int [][] arr) {
		int max = Integer.MIN_VALUE;
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			int num = arr[i][0];
			if(num>=max) {
				max = arr[i][1];
				cnt++;
			}
		}
		
		
		
		return cnt;
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
		    	if(o1[1] == o2[1]){
		        	return Integer.compare(o1[0],o2[0]);
		    	}
		        else{
		        	return Integer.compare(o1[1],o2[1]);
		        }
		    }
		});
		System.out.println(T.solution(arr)); 
	}
}




*/