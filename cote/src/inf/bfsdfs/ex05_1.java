package inf.bfsdfs;

public class ex05_1 {

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
	static int total, roop;
	static String answer;
	boolean flag = false;
	public void solution(int start,int sum, int [] arr) {
		if(flag) {
			return;
		}
		if(sum>(total/2)) {
			return;
		}	
		if(start==roop) {
			return ;
		}
		if((total-sum)==sum) {
			answer="YES";
			flag=true;
			return;
		}
			solution(start+1,sum+arr[start],arr);
			solution(start+1,sum,arr);
		


	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		roop = Integer.parseInt(br.readLine());
		StringTokenizer str = new StringTokenizer(br.readLine());
		int [] arr = new int[roop];
		for(int i=0; i<roop; i++) {
			total += arr[i] = Integer.parseInt(str.nextToken());
		}
		answer = "NO";
		T.solution(0,0,arr);
		System.out.println(answer);
	}

}



*/