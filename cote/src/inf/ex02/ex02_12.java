package inf.ex02;

public class ex02_12 {

}

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public String solution(  int n ){
		String answer = "";
		int cnt = 0;
		
		for(int i=1; i<n; i++) {
			int sum =0;
			for(int j=i; j<n; j++) {
				sum+=j;
				if(sum==n) {
					cnt++;
					break;
				}else if(sum>n) {
					break;
				}
			}
		}
		
		return Integer.toString(cnt);
		
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Main T = new Main();
		
	
	
	//	StringTokenizer st = new StringTokenizer(br.readLine());

		int n =  Integer.parseInt(br.readLine());

		System.out.println(T.solution(n));
	}

}




*/