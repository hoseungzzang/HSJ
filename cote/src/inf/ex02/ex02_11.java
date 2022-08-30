package inf.ex02;

public class ex02_11 {

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
	
	public String solution( int roop, int n, int [] arr) {
		String answer = "";
		int cnt = 0;
		for(int i=0; i<roop; i++) {
			int sum =0;
			for(int j=i; j<roop; j++) {
				sum += arr[j];
				if(sum == n) {
					cnt++;
					break;
				}else if(sum>n){
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
		
	
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int roop = Integer.parseInt(st.nextToken());
		int n =  Integer.parseInt(st.nextToken());
		int [] arr = new int [roop];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<roop; i++) {
	
			arr[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(T.solution(roop,n,arr));
	}

}




*/