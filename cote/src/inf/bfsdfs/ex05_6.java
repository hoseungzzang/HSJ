package inf.bfsdfs;

public class ex05_6 {

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
	static int answer =0;
	static int cnt=0;
	static int target;
	public void solution(int start, int sum, int[] arr) {
		if(start==arr.length) {
			if(sum==target) {
				cnt++;
			}
			return;
		}
		sum = sum+arr[start];
		solution(start+1,sum+arr[start],arr);
		
		sum = sum-arr[start];
		solution(start+1,sum-arr[start],arr);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		int[] numbers = {4, 1, 2, 1};
		 target=4;
		
		T.solution(0,0,numbers);
		System.out.println(cnt);
		
	}

}





*/