package inf.dp;

public class dp_01 {

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
	
	static int [] dy ;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3; i<=n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}

		
		
		return dy[n];
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
		int roop = Integer.parseInt(br.readLine());
		dy = new int[roop+1];
		System.out.println(T.solution(roop)); 
	}
}

*/