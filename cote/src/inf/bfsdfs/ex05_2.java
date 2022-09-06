package inf.bfsdfs;

public class ex05_2 {

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
	public void solution(int start,int sum, int [] arr) {
		if(start == roop) {
			if(total>sum &&max<sum) {
				max=sum;
			}
			return;
		}
		if(total<sum) {
			return;
		}else {
			if(max<sum) {
				max=sum;
			}
		}
		solution(start+1, sum+arr[start],arr);
		solution(start+1, sum,arr);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		total = Integer.parseInt(str.nextToken());
		roop = Integer.parseInt(str.nextToken());
		int [] arr = new int[roop];
		
		for(int i=0; i<roop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		T.solution(0,0,arr);
		System.out.println(max);
	}

}



*/